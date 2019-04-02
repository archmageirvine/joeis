package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041376 Numerators of continued fraction convergents to sqrt(203).
 * @author Sean A. Irvine
 */
public class A041376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041376() {
    super(new long[] {-1, 0, 114, 0}, new long[] {14, 57, 1610, 6497});
  }
}
