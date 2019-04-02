package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041872 Numerators of continued fraction convergents to sqrt(458).
 * @author Sean A. Irvine
 */
public class A041872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041872() {
    super(new long[] {1, 0, 0, 214, 0, 0}, new long[] {21, 43, 107, 4537, 9181, 22899});
  }
}
