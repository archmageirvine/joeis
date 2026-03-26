package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.Sequence1;

/**
 * A394327 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A394327 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A394327() {
    super(1, 1, new Sequence1() {
      private long mN = 0;
      @Override
      public Z next() {
        return Functions.SIGMA0.z(++mN).min(Functions.SIGMA0.z(mN + 1)).min(Functions.SIGMA0.z(mN + 2));
      }
    });
  }
}
