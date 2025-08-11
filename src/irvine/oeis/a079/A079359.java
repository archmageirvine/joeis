package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000002;
import irvine.oeis.transform.SumOfRunsTransform;

/**
 * A079359 Iterate the process: "sum of terms of n-th run" on the Kolakoski sequence until all runs have length 1.
 * @author Sean A. Irvine
 */
public class A079359 extends Sequence1 {

  // Conjectured that 3 is enough, we will detect if this fails
  private final Sequence mA = new SumOfRunsTransform(new SumOfRunsTransform(new SumOfRunsTransform(new A000002())));
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mPrev;
    mPrev = mA.next();
    if (t.equals(mA)) {
      throw new RuntimeException("Conjecture failed");
    }
    return mPrev;
  }
}
