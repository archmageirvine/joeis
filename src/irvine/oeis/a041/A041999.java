package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041999 Denominators of continued fraction convergents to <code>sqrt(522)</code>.
 * @author Sean A. Irvine
 */
public class A041999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041999() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 39206, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 6, 7, 13, 59, 72, 131, 727, 858, 38479, 39337, 235164, 274501, 509665, 2313161, 2822826, 5135987, 28502761, 33638748});
  }
}
