package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a003.A003336;
import irvine.oeis.a003.A003337;
import irvine.oeis.a003.A003338;
import irvine.oeis.a003.A003339;
import irvine.oeis.a003.A003340;
import irvine.oeis.a003.A003341;
import irvine.oeis.a003.A003342;

/**
 * A047719 Numbers that are the sum of 8 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A047719 implements Sequence {

  private final Sequence mSeq = SetDifferenceSequence.create(new A003342(), new A003341(), new A003340(), new A003339(), new A003338(), new A003337(), new A003336(), new A000583());

  @Override
  public Z next() {
    return mSeq.next();
  }
}
