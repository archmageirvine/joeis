package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041851 Denominators of continued fraction convergents to sqrt(447).
 * @author Sean A. Irvine
 */
public class A041851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041851() {
    super(new long[] {-1, 0, 296, 0}, new long[] {1, 7, 295, 2072});
  }
}
