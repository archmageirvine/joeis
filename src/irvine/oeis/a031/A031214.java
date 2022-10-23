package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.DeadSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SequenceFactory;

/**
 * A031214 Initial term of sequence An.
 * @author Sean A. Irvine
 */
public class A031214 extends Sequence1 {

  // This is an appalling sequence as it requires values for dead sequences

  private static final long[] DEADS = {1, 1, 2};
  private int mDeadIndex = -1;
  private int mN = 0;

  @Override
  public Z next() {
    final Sequence sequence = SequenceFactory.sequence(SequenceFactory.getCanonicalId("A" + ++mN));
    return sequence instanceof DeadSequence ? Z.valueOf(DEADS[++mDeadIndex]) : sequence.next();
  }
}
