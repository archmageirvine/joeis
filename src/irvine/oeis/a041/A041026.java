package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041026 Numerators of continued fraction convergents to <code>sqrt(18)</code>.
 * @author Sean A. Irvine
 */
public class A041026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041026() {
    super(new long[] {-1, 0, 34, 0}, new long[] {4, 17, 140, 577});
  }
}
