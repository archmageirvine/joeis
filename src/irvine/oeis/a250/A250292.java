package irvine.oeis.a250;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000129;

/**
 * A250292 Numbers k such that Pell(k) is a semiprime.
 * @author Sean A. Irvine
 */
public class A250292 extends AbstractSequence {

  private final A000129 mSeq1 = new A000129();

  /** Construct the sequence. */
  public A250292() {
    super(1);
  }

  private long mN = 1;

  {
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = Jaguar.factorAllowIncomplete(mSeq1.next());
      final int semi = fs.isSemiprime();
      if (semi == FactorSequence.YES) {
        return Z.valueOf(mN);
      } else if (semi == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Unknown status, Pell(" + mN + ")=" + fs);
      }
    }
  }
}
