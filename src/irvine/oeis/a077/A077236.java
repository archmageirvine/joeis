package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077236 <code>a(n) = 4*a(n-1) - a(n-2)</code> with <code>a(0) = 4</code> and <code>a(1) = 11</code>.
 * @author Sean A. Irvine
 */
public class A077236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077236() {
    super(new long[] {-1, 4}, new long[] {4, 11});
  }
}
