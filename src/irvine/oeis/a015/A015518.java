package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015518 <code>a(n) = 2*a(n-1) + 3*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A015518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015518() {
    super(new long[] {3, 2}, new long[] {0, 1});
  }
}
