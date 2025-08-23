package irvine.oeis.a386;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;

/**
 * A386016 A sequence constructed by greedily sampling the Borel distribution for parameter value 1/2 to minimize discrepancy.
 * @author Sean A. Irvine
 */
public class A386950 extends A386016 {

  private static CR[] getPdf() {
    final HarmonicSequence h = new HarmonicSequence();
    final Q[] hq = new Q[11];
    hq[0] = Q.ZERO;
    for (int k = 1; k < hq.length; ++k) {
      hq[k] = h.nextQ();
    }
    final CR[] pdf = new CR[hq.length];
    for (int k = 0; k < hq.length; ++k) {
      pdf[k] = CR.valueOf(hq[10].subtract(hq[k]).divide(10));
    }
    return pdf;
  }

  /** Construct the sequence. */
  public A386950() {
    super(0, new MemoryFunction1<>() {
      private final CR[] mPdf1 = getPdf();
      @Override
      protected CR compute(final int n) {
        return mPdf1[n];
      }
    });
  }
}

