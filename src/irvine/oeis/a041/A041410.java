package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041410 Numerators of continued fraction convergents to sqrt(220).
 * @author Sean A. Irvine
 */
public class A041410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041410() {
    super(new long[] {-1, 0, 0, 0, 178, 0, 0, 0}, new long[] {14, 15, 74, 89, 2566, 2655, 13186, 15841});
  }
}
