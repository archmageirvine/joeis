package irvine.oeis.a106;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A106133 Numbers k such that the k-th semiprime == 8 (mod k).
 * @author Sean A. Irvine
 */
public class A106133 implements Sequence {

  private long mN = 0;
  private long mSearch = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mSearch);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException();
      }
      if (sp == FactorSequence.YES && mSearch % ++mN == 8 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

