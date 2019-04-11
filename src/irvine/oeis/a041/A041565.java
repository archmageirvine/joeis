package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041565 Denominators of continued fraction convergents to <code>sqrt(300)</code>.
 * @author Sean A. Irvine
 */
public class A041565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041565() {
    super(new long[] {-1, 0, 0, 0, 2702, 0, 0, 0}, new long[] {1, 3, 25, 78, 2677, 8109, 67549, 210756});
  }
}
