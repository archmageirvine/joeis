package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255186 27-gonal numbers: a(n) = n*(25*n-23)/2.
 * @author Sean A. Irvine
 */
public class A255186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255186() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 27});
  }
}
