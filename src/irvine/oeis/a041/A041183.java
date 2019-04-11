package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041183 Denominators of continued fraction convergents to <code>sqrt(102)</code>.
 * @author Sean A. Irvine
 */
public class A041183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041183() {
    super(new long[] {-1, 0, 202, 0}, new long[] {1, 10, 201, 2020});
  }
}
