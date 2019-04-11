package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041968 Numerators of continued fraction convergents to <code>sqrt(507)</code>.
 * @author Sean A. Irvine
 */
public class A041968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041968() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2702, 0, 0, 0, 0, 0}, new long[] {22, 23, 45, 653, 698, 1351, 60142, 61493, 121635, 1764383, 1886018, 3650401});
  }
}
