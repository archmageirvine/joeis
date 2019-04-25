package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098578 <code>a(n) = Sum_{k=0..floor(n/4)} C(n-3*k,k+1)</code>.
 * @author Sean A. Irvine
 */
public class A098578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098578() {
    super(new long[] {-1, 1, 0, -1, 2}, new long[] {0, 1, 2, 3, 4});
  }
}
