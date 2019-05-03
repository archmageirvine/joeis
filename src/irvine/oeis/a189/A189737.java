package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189737 <code>a(1)=3, a(2)=3, a(n)=3*a(n-1) + 3*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A189737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189737() {
    super(new long[] {3, 3}, new long[] {3, 3});
  }
}
