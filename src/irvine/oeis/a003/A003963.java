package irvine.oeis.a003;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003963 Fully multiplicative with a(p) = k if p is the k-th prime.
 * @author Sean A. Irvine
 */
public class A003963 extends Sequence1 {

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
    final FactorSequence fs = Jaguar.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(pi(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
