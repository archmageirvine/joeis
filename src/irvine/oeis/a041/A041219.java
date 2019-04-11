package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041219 Denominators of continued fraction convergents to <code>sqrt(120)</code>.
 * @author Sean A. Irvine
 */
public class A041219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041219() {
    super(new long[] {-1, 0, 22, 0}, new long[] {1, 1, 21, 22});
  }
}
