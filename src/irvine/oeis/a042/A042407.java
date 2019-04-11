package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042407 Denominators of continued fraction convergents to <code>sqrt(731)</code>.
 * @author Sean A. Irvine
 */
public class A042407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042407() {
    super(new long[] {-1, 0, 1460, 0}, new long[] {1, 27, 1459, 39420});
  }
}
