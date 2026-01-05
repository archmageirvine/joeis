package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.SumOfLikePowersSequence;
import irvine.oeis.a003.A003339;

/**
 * A047716 Sums of 5 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A047716 extends Sequence1 {

  private final Sequence mSeq = new SetDifferenceSequence(new A003339(), new SumOfLikePowersSequence(4, 1, 4, false));
  //private final Sequence mSeq = SetDifferenceSequence.create(new A003339(), new A003338(), new A003337(), new A003336(), new A000583());

  @Override
  public Z next() {
    return mSeq.next();
  }
}
