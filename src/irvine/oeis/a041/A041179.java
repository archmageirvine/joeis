package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041179 Denominators of continued fraction convergents to <code>sqrt(99)</code>.
 * @author Sean A. Irvine
 */
public class A041179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041179() {
    super(new long[] {-1, 0, 20, 0}, new long[] {1, 1, 19, 20});
  }
}
