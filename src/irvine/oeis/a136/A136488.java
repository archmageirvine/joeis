package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136488 <code>a(n) = 2^n -</code> A005418(n).
 * @author Sean A. Irvine
 */
public class A136488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136488() {
    super(new long[] {-4, 2, 2}, new long[] {1, 2, 5});
  }
}
