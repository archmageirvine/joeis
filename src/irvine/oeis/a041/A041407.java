package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041407 Denominators of continued fraction convergents to <code>sqrt(218)</code>.
 * @author Sean A. Irvine
 */
public class A041407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041407() {
    super(new long[] {1, 0, 0, 0, 0, 502, 0, 0, 0, 0}, new long[] {1, 1, 4, 13, 17, 489, 506, 2007, 6527, 8534});
  }
}
