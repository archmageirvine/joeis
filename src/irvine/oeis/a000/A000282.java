package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a054.A054747;

/**
 * A000282 Finite automata.
 * @author Sean A. Irvine
 */
public class A000282 implements Sequence {

  private final A054747 mA = new A054747();
  private final ArrayList<Z> mS = new ArrayList<>();
  {
    mS.add(Z.ZERO);
  }
  private int mN = 0;

  private int mob(final int m, final int n) {
    if (m % n == 0) {
      return Mobius.mobius(m / n);
    }
    return 0;
  }

  @Override
  public Z next() {
    // Inverse Euler transform of A054747
    ++mN;
    mS.add(mA.next());
    final Z[] c = new Z[mS.size()];
    for (int k = 1; k < c.length; ++k) {
      Z t = mS.get(k).multiply(k);
      for (int d = 1; d < k; ++d) {
        t = t.subtract(c[d].multiply(mS.get(k - d)));
      }
      c[k] = t;
    }
    Z z = Z.ZERO;
    for (int d = 1; d <= mN; ++d) {
      z = z.add(c[d].multiply(mob(mN, d)));
    }
    return z.divide(mN);
  }
}
