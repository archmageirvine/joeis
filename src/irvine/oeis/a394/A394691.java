package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394691 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A394691 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      ++m;
      final FactorSequence fs = new FactorSequence();
      for (long k = 0; k < mN; ++k) {
        fs.add(m + k);
      }
      Jaguar.factor(fs);
      if (fs.omega() == 2 * mN) {
        return Z.valueOf(m);
      }
    }
  }
}

