package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a003.A003336;
import irvine.oeis.a003.A003337;
import irvine.oeis.a003.A003338;
import irvine.oeis.a003.A003339;

/**
 * A047716 Sums of 5 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A047716 implements Sequence {

  private final Sequence mSeq = SetDifferenceSequence.create(new A003339(), new A003338(), new A003337(), new A003336(), new A000583());

  @Override
  public Z next() {
    return mSeq.next();
  }
}
