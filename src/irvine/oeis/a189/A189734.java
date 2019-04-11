package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189734 <code>a(1)=2, a(2)=5, a(n)=2*a(n-1) + 5*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A189734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189734() {
    super(new long[] {5, 2}, new long[] {2, 5});
  }
}
