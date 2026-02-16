package irvine.oeis.a083;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083796 Triangle read by rows in which the n-th row contains n lexicographically earliest distinct numbers such that the sum of the (n-1) terms other than the r-th term is divisible by r.
 * @author Sean A. Irvine
 */
public class A083796 extends Sequence1 {

  // After Max Alekseyev

  private final LinkedList<Z> mA = new LinkedList<>();
  private int mN = 0;

  private boolean contains(final Z[] r, final Z n) {
    for (final Z t : r) {
      if (n.equals(t)) {
        return true;
      }
    }
    return false;
  }

  private Z sum(final Z[] r, final int lo, final int hi) {
    Z sum = Z.ZERO;
    for (int k = lo; k <= hi; ++k) {
      sum = sum.add(r[k]);
    }
    return sum;
  }

  // Two congruence, supporting non-coprime moduli
  private static Z[] chinese(final Z a, final Z m, final Z b, final Z n) {
    final Z g = m.gcd(n);
    if (!a.subtract(b).mod(g).isZero()) {
      throw new ArithmeticException("Inconsistent congruences");
    }
    // m = g*m', n = g*n'
    final Z mp = m.divide(g);
    final Z np = n.divide(g);
    // Solve m' * k == (b-a)/g (mod n')
    final Z rhs = b.subtract(a).divide(g);
    final Z k = np.isOne() ? Z.ZERO : rhs.multiply(mp.modInverse(np)).mod(np);
    // x = a + m*k
    final Z x = a.add(m.multiply(k));
    // modulus = lcm(m,n)
    final Z mod = m.multiply(n).divide(g);
    return new Z[] {x.mod(mod), mod};
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] r = new Z[++mN];
      Arrays.fill(r, Z.ZERO);
      Z s = Z.ZERO;
      Z sMod = Z.ONE;
      for (int i = 1; i < mN; ++i) {
        final Z m = Functions.GCD.z(sMod, i);
        Z t = s.mod(m);
        while (contains(r, t) || (i == mN - 1 && sum(r, 0, mN - 3).add(t).mod(mN) != 0)) {
          t = t.add(m);
        }
        r[i - 1] = t;
        final Z[] c = chinese(s, sMod, t, Z.valueOf(i));
        s = c[0];
        sMod = c[1];
      }
      Z t = s.subtract(sum(r, 0, mN - 2));
      while (t.signum() <= 0 || contains(r, t)) {
        t = t.add(sMod);
      }
      r[mN - 1] = t;
      Collections.addAll(mA, r);
    }
    return mA.pollFirst();
  }
}
