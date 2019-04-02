package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041273 Denominators of continued fraction convergents to sqrt(149).
 * @author Sean A. Irvine
 */
public class A041273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041273() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 227164, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 29, 92, 305, 1617, 1922, 9305, 225242, 910273, 1135515, 6587848, 20899059, 69285025, 367324184, 436609209, 2113761020});
  }
}
