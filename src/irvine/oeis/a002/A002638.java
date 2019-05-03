package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000568;

/**
 * A002638 <code>a(n) =</code> (number of nonisomorphic nontransitive prime tournaments on <code>n nodes) - Moebius(n)</code>.
 * @author Sean A. Irvine
 */
public class A002638 extends A000568 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final ArrayList<Z> mB = new ArrayList<>();
  {
    mA.add(super.next());
    mB.add(null);
  }
  private int mN = 0;

  @Override
  public Z next() {
    mA.add(super.next());
    if (++mN == 1) {
      mB.add(Z.NEG_ONE);
    } else {
      Z s = mA.get(mN);
      for (final Z dd : Cheetah.factor(mN).divisors()) {
        final int d = dd.intValueExact();
        if (d != 1 && d != mN) {
          s = s.subtract(mA.get(mN / d).multiply(mB.get(d)));
        }
      }
      mB.add(s);
    }
    return mB.get(mB.size() - 1);
  }
}
