package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095263 <code>a(n+3) = 3*a(n+2) - 2*a(n+1) + a(n)</code>.
 * @author Sean A. Irvine
 */
public class A095263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095263() {
    super(new long[] {1, -2, 3}, new long[] {1, 3, 7});
  }
}
