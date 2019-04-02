package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041073 Denominators of continued fraction convergents to sqrt(43).
 * @author Sean A. Irvine
 */
public class A041073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041073() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6964, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 9, 52, 61, 235, 296, 531, 6668, 7199, 13867, 48800, 62667, 362135, 424802, 1636541, 2061343, 3697884});
  }
}
