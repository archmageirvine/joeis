package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041651 Denominators of continued fraction convergents to <code>sqrt(344)</code>.
 * @author Sean A. Irvine
 */
public class A041651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041651() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20810, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 9, 11, 42, 53, 254, 307, 561, 20503, 21064, 41567, 187332, 228899, 874029, 1102928, 5285741, 6388669, 11674410});
  }
}
