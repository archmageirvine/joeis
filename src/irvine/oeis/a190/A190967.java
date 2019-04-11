package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190967 <code>a(n) = 4*a(n-1) - 9*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190967() {
    super(new long[] {-9, 4}, new long[] {0, 1});
  }
}
