package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041091 Denominators of continued fraction convergents to <code>sqrt(53)</code>.
 * @author Sean A. Irvine
 */
public class A041091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041091() {
    super(new long[] {1, 0, 0, 0, 0, 364, 0, 0, 0, 0}, new long[] {1, 3, 4, 7, 25, 357, 1096, 1453, 2549, 9100});
  }
}
