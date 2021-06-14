package irvine.oeis.a097;

import java.util.TreeMap;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A097621 In canonical prime factorization of n replace the k-th prime power with k.
 * @author Sean A. Irvine
 */
public class A097621 extends A000961 {

  private final TreeMap<Z, Long> mPowerToIndex = new TreeMap<>();
  private long mPowerIndex = 0;
  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z pe = p.pow(fs.getExponent(p));
      while (!mPowerToIndex.containsKey(pe)) {
        mPowerToIndex.put(super.next(), ++mPowerIndex);
      }
      prod = prod.multiply(mPowerToIndex.get(pe));
    }
    return prod;
  }
}

