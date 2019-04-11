package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259592 Denominators of the other-side convergents to <code>sqrt(3)</code>.
 * @author Sean A. Irvine
 */
public class A259592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259592() {
    super(new long[] {-1, 0, 4, 0}, new long[] {1, 2, 4, 7});
  }
}
