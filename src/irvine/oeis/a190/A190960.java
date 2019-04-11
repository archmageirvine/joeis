package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190960 <code>a(n) = 3*a(n-1) - 6*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190960() {
    super(new long[] {-6, 3}, new long[] {0, 1});
  }
}
