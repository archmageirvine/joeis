package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041799 Denominators of continued fraction convergents to <code>sqrt(420)</code>.
 * @author Sean A. Irvine
 */
public class A041799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041799() {
    super(new long[] {-1, 0, 82, 0}, new long[] {1, 2, 81, 164});
  }
}
