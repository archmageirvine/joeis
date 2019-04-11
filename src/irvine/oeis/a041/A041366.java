package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041366 Numerators of continued fraction convergents to <code>sqrt(198)</code>.
 * @author Sean A. Irvine
 */
public class A041366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041366() {
    super(new long[] {-1, 0, 394, 0}, new long[] {14, 197, 5530, 77617});
  }
}
