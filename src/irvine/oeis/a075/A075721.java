package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a056.A056240;

/**
 * A075721 a(n+1) = least k with sum of prime factors (with repetition) = a(n)+1 with a(0) = 2.
 * @author Sean A. Irvine
 */
public class A075721 extends Sequence0 {

  // After David Wasserman

  private static final Z[] SMALL = {Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.EIGHT};
  private Z mA = null;
  private int mN = 0;
  private final DirectSequence mV = DirectSequence.create(2, new A056240());

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      mA = SMALL[mN++];
    } else {
      Z p = Functions.PREV_PRIME.z(mA.add(2));
      if (p.equals(mA.add(1))) {
        mA = p;
      } else {
        final Z n1 = mA.add(1);
        Z b = mV.a(n1.subtract(p));
        Z c = p;
        while (b.compareTo(n1.subtract(p)) > 0) {
          p = Functions.PREV_PRIME.z(p);
          Z m = mV.a(n1.subtract(p));
          if (m.compareTo(b) < 0) {
            b = m;
            c = p;
          }
        }
        mA = b.multiply(c);
      }
    }
    return mA;
  }
}
// v = vector(200); count = 0; m = 2; print1("2 3 4 5 8 "); n = 8; while (count < 199, f = factor(m); s = sum(i = 1, matsize(f)[1], f[i, 1]*f[i, 2]); if (s <= 200 && v[s] == 0, count++; v[s] = m); m++);
// for (i = 1, 20,
// p = precprime(n + 1);
// if (p == n + 1, n++; print1(n, " "),
// b = v[n + 1 - p];
// c = p;
// while (b > n + 1 - p, p = precprime(p - 1); m = v[n + 1 - p]; if (m < b, b = m; c = p));
// n = b*c;
// print1(n, " ")));
