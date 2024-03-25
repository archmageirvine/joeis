package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068886 First of n consecutive numbers such that the k-th number is divisible by a k-th power for k = 1,...,n.
 * @author Sean A. Irvine
 */
public class A068886 extends Sequence1 {

  private long mM = 1;
  private int mN = 0;

  private int count(final long m) {
    int count = 1;
    int k = 1; // Any number is divisible by the first power of some number!
    while (true) {
      ++k;
      final FactorSequence fs = Jaguar.factor(m + k - 1);
      if (fs.maxExponent() < k) {
        return count;
      }
      ++count;
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (count(mM) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
