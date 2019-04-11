package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041982 Numerators of continued fraction convergents to <code>sqrt(514)</code>.
 * @author Sean A. Irvine
 */
public class A041982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041982() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 9250, 0, 0, 0, 0, 0}, new long[] {22, 23, 68, 1519, 3106, 4625, 206606, 211231, 629068, 14050727, 28730522, 42781249});
  }
}
