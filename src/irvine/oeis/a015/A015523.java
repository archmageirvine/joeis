package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015523 <code>a(n) = 3*a(n-1) + 5*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A015523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015523() {
    super(new long[] {5, 3}, new long[] {0, 1});
  }
}
