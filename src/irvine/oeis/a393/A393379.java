package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.Sequence1;

/**
 * A393379 The records of min(d(k), d(k+1), d(k+2)), where d(k) is the number of divisors of k (A000005).
 * @author Sean A. Irvine
 */
public class A393379 extends RecordSequence {

  /** Construct the sequence. */
  public A393379() {
    super(1, new Sequence1() {
      private long mN = 0;
      @Override
      public Z next() {
        return Functions.SIGMA0.z(++mN).min(Functions.SIGMA0.z(mN + 1)).min(Functions.SIGMA0.z(mN + 2));
      }
    });
  }
}
