package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041419 Denominators of continued fraction convergents to <code>sqrt(224)</code>.
 * @author Sean A. Irvine
 */
public class A041419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041419() {
    super(new long[] {-1, 0, 30, 0}, new long[] {1, 1, 29, 30});
  }
}
