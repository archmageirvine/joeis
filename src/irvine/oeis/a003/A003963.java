package irvine.oeis.a003;

import java.util.HashMap;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003963.
 * @author Sean A. Irvine
 */
public class A003963 implements Sequence {

  private long mN = 0;
  private Z mP = Z.ZERO;
  private final HashMap<Z, Z> mPrimeToIndex = new HashMap<>();

  protected Z pi(final Z p) {
    final Z pi = mPrimeToIndex.get(p);
    if (pi != null) {
      return pi;
    }
    mP = mP.add(1);
    mPrimeToIndex.put(p, mP);
    return mP;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(pi(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
