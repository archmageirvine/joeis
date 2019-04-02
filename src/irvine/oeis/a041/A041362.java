package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041362 Numerators of continued fraction convergents to sqrt(195).
 * @author Sean A. Irvine
 */
public class A041362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041362() {
    super(new long[] {-1, 0, 28, 0}, new long[] {13, 14, 377, 391});
  }
}
