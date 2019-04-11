package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041212 Numerators of continued fraction convergents to <code>sqrt(117)</code>.
 * @author Sean A. Irvine
 */
public class A041212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041212() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1298, 0, 0, 0, 0, 0}, new long[] {10, 11, 54, 119, 530, 649, 13510, 14159, 70146, 154451, 687950, 842401});
  }
}
