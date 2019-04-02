package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041267 Denominators of continued fraction convergents to sqrt(146).
 * @author Sean A. Irvine
 */
public class A041267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041267() {
    super(new long[] {-1, 0, 290, 0}, new long[] {1, 12, 289, 3480});
  }
}
