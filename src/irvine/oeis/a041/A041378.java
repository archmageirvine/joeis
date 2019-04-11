package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041378 Numerators of continued fraction convergents to <code>sqrt(204)</code>.
 * @author Sean A. Irvine
 */
public class A041378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041378() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9998, 0, 0, 0, 0, 0, 0, 0}, new long[] {14, 43, 57, 100, 657, 757, 1414, 4999, 141386, 429157, 570543, 999700, 6568743, 7568443, 14137186, 49980001});
  }
}
