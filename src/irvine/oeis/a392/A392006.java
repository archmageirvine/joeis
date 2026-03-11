package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.Sequence1;

/**
 * A392006 Indices corresponding to records in A392071.
 * @author Sean A. Irvine
 */
public class A392006 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A392006() {
    super(1, 1, new Sequence1() {
      private long mN = 0;

      @Override
      public Z next() {
        return Functions.MIN.z(Functions.SIGMA0.z(++mN), Functions.SIGMA0.z(mN + 2));
      }
    });
  }
}
