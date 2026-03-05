package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.Sequence1;

/**
 * A392071 The records of min(d(k), d(k+2)), where d(k) is the number of divisors of k (A000005).
 * @author Sean A. Irvine
 */
public class A392071 extends RecordSequence {

  /** Construct the sequence. */
  public A392071() {
    super(1, new Sequence1() {
      private long mN = 0;

      @Override
      public Z next() {
        return Functions.MIN.z(Functions.SIGMA0.z(++mN), Functions.SIGMA0.z(mN + 2));
      }
    });
  }
}
