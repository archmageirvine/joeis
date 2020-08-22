package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080675 a(n) = (5*4^n - 8)/6.
 * @author Sean A. Irvine
 */
public class A080675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080675() {
    super(new long[] {-4, 5}, new long[] {2, 12});
  }
}
