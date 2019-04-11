package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041811 Denominators of continued fraction convergents to <code>sqrt(426)</code>.
 * @author Sean A. Irvine
 */
public class A041811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041811() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 177502, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 11, 25, 161, 347, 1202, 1549, 2751, 4300, 174751, 179051, 353802, 532853, 1952361, 4437575, 28577811, 61593197, 213357402, 274950599, 488308001, 763258600});
  }
}
