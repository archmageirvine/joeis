package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041205 Denominators of continued fraction convergents to sqrt(113).
 * @author Sean A. Irvine
 */
public class A041205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041205() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1552, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 8, 19, 27, 46, 73, 1506, 1579, 3085, 4664, 12413, 29490, 41903, 71393, 113296});
  }
}
