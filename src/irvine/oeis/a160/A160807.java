package irvine.oeis.a160;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a130.A130665;

/**
 * A160807 a(n) = A160799(n)/4.
 * @author Sean A. Irvine
 */
public class A160807 extends PartialSumSequence {

  /** Construct the sequence. */
  public A160807() {
    super(1, new PrependSequence(new A130665(), 0));
  }
}
