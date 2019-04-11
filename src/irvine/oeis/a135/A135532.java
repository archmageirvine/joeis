package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135532 <code>a(n) = 2*a(n-1) + a(n-2),</code> with <code>a(0)= -1, a(1)= 3</code>.
 * @author Sean A. Irvine
 */
public class A135532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135532() {
    super(new long[] {1, 2}, new long[] {-1, 3});
  }
}
