package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042681 Denominators of continued fraction convergents to <code>sqrt(870)</code>.
 * @author Sean A. Irvine
 */
public class A042681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042681() {
    super(new long[] {-1, 0, 118, 0}, new long[] {1, 2, 117, 236});
  }
}
