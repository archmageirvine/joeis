package irvine.oeis.a003;

import java.util.HashMap;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003964.
 * @author Sean A. Irvine
 */
public class A003964 implements Sequence {

  private long mN = 0;
  private int mP = 1;
  private final HashMap<Z, Z> mPrimeToIndex = new HashMap<>();

  protected Z partitionPi(final Z p) {
    final Z pi = mPrimeToIndex.get(p);
    if (pi != null) {
      return pi;
    }
    final Z res = IntegerPartition.partitions(++mP);
    mPrimeToIndex.put(p, res);
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(partitionPi(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
