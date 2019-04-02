package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041523 Denominators of continued fraction convergents to sqrt(278).
 * @author Sean A. Irvine
 */
public class A041523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041523() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 5002, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 49, 101, 150, 4901, 5051, 15003, 245099, 505201, 750300});
  }
}
