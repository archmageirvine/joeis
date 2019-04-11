package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041920 Numerators of continued fraction convergents to <code>sqrt(482)</code>.
 * @author Sean A. Irvine
 */
public class A041920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041920() {
    super(new long[] {-1, 0, 0, 0, 966, 0, 0, 0}, new long[] {21, 22, 461, 483, 20747, 21230, 445347, 466577});
  }
}
