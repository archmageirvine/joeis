package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190140 <code>a(n) = 2*a(n-1) + a(n-2) + 3*a(n-3), a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A190140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190140() {
    super(new long[] {3, 1, 2}, new long[] {1, 2, 5});
  }
}
