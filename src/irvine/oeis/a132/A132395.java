package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132395 a(n) = (11^(n+2) + 12^(2*n+1))/133.
 * @author Sean A. Irvine
 */
public class A132395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132395() {
    super(new long[] {-1584, 155}, new long[] {1, 23});
  }
}
