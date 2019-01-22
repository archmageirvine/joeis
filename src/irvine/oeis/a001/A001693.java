package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A001693.
 * @author Sean A. Irvine
 */
public class A001693 implements Sequence {

  private final ArrayList<Z> mPowers = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mPowers.add(Z.ONE);
      return Z.ONE;
    }
    mPowers.add(mPowers.get(mN - 1).multiply(7));
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final int dd = d.intValue();
      s = s.add(mPowers.get(mN / dd).multiply(Mobius.mobius(dd)));
    }
    return s.divide(mN);
  }
}
