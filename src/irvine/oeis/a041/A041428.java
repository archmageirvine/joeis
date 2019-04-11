package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041428 Numerators of continued fraction convergents to <code>sqrt(230)</code>.
 * @author Sean A. Irvine
 */
public class A041428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041428() {
    super(new long[] {-1, 0, 182, 0}, new long[] {15, 91, 2745, 16561});
  }
}
