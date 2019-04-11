package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042265 Denominators of continued fraction convergents to <code>sqrt(658)</code>.
 * @author Sean A. Irvine
 */
public class A042265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042265() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3386, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 20, 23, 43, 66, 3343, 3409, 6752, 10161, 67718, 77879, 145597, 223476});
  }
}
