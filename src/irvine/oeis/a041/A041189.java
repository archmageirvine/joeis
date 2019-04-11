package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041189 Denominators of continued fraction convergents to <code>sqrt(105)</code>.
 * @author Sean A. Irvine
 */
public class A041189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041189() {
    super(new long[] {-1, 0, 82, 0}, new long[] {1, 4, 81, 328});
  }
}
