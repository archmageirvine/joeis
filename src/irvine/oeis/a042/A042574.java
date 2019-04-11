package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042574 Numerators of continued fraction convergents to <code>sqrt(816)</code>.
 * @author Sean A. Irvine
 */
public class A042574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042574() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9998, 0, 0, 0, 0, 0, 0, 0}, new long[] {28, 29, 57, 200, 657, 2171, 2828, 4999, 282772, 287771, 570543, 1999400, 6568743, 21705629, 28274372, 49980001});
  }
}
