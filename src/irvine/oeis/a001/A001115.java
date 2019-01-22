package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A001115.
 * @author Sean A. Irvine
 */
public class A001115 implements Sequence {

  private final ArrayList<Z> mP = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mP.add(Z.ONE);
    } else {
      Z p = Z.ZERO;
      for (final Z dd : Cheetah.factor(mN).divisors()) {
        final int d = dd.intValue();
        p = p.add(Z.valueOf(Mobius.mobius(mN / d)).shiftLeft(d));
      }
      mP.add(p.divide(mN));
    }
    Z a = mP.get(mN);
    for (int k = 1; k <= mN / 2; ++k) {
      a = a.add(mP.get(k));
    }
    return a;
  }
}

