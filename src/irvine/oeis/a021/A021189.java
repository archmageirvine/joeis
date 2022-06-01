package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021189 Decimal expansion of 1/185.
 * @author Sean A. Irvine
 */
public class A021189 extends PrependSequence {

  /** Construct the sequence. */
  public A021189() {
    super(new PeriodicSequence(0, 5, 4), 0);
  }
}
