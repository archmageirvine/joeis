package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041142 Numerators of continued fraction convergents to sqrt(80).
 * @author Sean A. Irvine
 */
public class A041142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041142() {
    super(new long[] {-1, 0, 18, 0}, new long[] {1, 8, 9, 152});
  }
}
