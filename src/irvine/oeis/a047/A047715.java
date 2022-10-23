package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a003.A003336;
import irvine.oeis.a003.A003337;
import irvine.oeis.a003.A003338;

/**
 * A047715 Numbers that are the sum of 4 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A047715 extends Sequence1 {

  private final Sequence mSeq = SetDifferenceSequence.create(new A003338(), new A003337(), new A003336(), new A000583());

  @Override
  public Z next() {
    return mSeq.next();
  }
}
