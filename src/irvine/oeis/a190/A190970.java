package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190970 <code>a(n) = 5*a(n-1) - 9*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190970() {
    super(new long[] {-9, 5}, new long[] {0, 1});
  }
}
