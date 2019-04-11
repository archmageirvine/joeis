package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042701 Denominators of continued fraction convergents to <code>sqrt(880)</code>.
 * @author Sean A. Irvine
 */
public class A042701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042701() {
    super(new long[] {-1, 0, 0, 0, 178, 0, 0, 0}, new long[] {1, 1, 2, 3, 176, 179, 355, 534});
  }
}
