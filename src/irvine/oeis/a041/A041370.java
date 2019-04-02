package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041370 Numerators of continued fraction convergents to sqrt(200).
 * @author Sean A. Irvine
 */
public class A041370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041370() {
    super(new long[] {-1, 0, 198, 0}, new long[] {14, 99, 2786, 19601});
  }
}
