package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041581 Denominators of continued fraction convergents to sqrt(308).
 * @author Sean A. Irvine
 */
public class A041581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041581() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 702, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 9, 11, 20, 691, 711, 1402, 6319, 7721, 14040});
  }
}
