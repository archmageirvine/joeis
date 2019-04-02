package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042191 Denominators of continued fraction convergents to sqrt(620).
 * @author Sean A. Irvine
 */
public class A042191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042191() {
    super(new long[] {-1, 0, 0, 0, 498, 0, 0, 0}, new long[] {1, 1, 9, 10, 489, 499, 4481, 4980});
  }
}
