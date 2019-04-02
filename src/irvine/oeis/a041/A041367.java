package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041367 Denominators of continued fraction convergents to sqrt(198).
 * @author Sean A. Irvine
 */
public class A041367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041367() {
    super(new long[] {-1, 0, 394, 0}, new long[] {1, 14, 393, 5516});
  }
}
