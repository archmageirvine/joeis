package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190963 <code>a(n) = 3*a(n-1) - 9*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190963() {
    super(new long[] {-9, 3}, new long[] {0, 1});
  }
}
