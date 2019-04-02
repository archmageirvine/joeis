package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041070 Numerators of continued fraction convergents to sqrt(42).
 * @author Sean A. Irvine
 */
public class A041070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041070() {
    super(new long[] {-1, 0, 26, 0}, new long[] {6, 13, 162, 337});
  }
}
