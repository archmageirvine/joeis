package irvine.oeis.a250;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A250292 Numbers n such that <code>Pell(n)</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A250292 extends A000129 {

  private long mN = 1;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = Jaguar.factorAllowIncomplete(super.next());
      final int semi = fs.isSemiprime();
      if (semi == FactorSequence.YES) {
        return Z.valueOf(mN);
      } else if (semi == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Unknown status, Pell(" + mN + ")=" + fs);
      }
    }
  }
}
