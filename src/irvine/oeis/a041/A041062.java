package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041062 Numerators of continued fraction convergents to sqrt(38).
 * @author Sean A. Irvine
 */
public class A041062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041062() {
    super(new long[] {-1, 0, 74, 0}, new long[] {6, 37, 450, 2737});
  }
}
