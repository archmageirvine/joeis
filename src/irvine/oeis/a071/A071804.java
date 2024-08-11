package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071779.
 * @author Sean A. Irvine
 */
public class A071804 extends Sequence1 {

  private int mCount = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (int j = 1; j <= mN; ++j) {
      final FactorSequence fs = new FactorSequence();
      fs.add(mN, FactorSequence.UNKNOWN, j);
      Jaguar.factor(fs);
      if (fs.sigma0AsLong() == mN + j) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
