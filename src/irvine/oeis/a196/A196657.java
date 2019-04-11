package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196657 <code>63*2^(n+1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A196657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196657() {
    super(new long[] {-2, 3}, new long[] {127, 253});
  }
}
