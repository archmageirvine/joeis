package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189742 <code>a(1)=4, a(2)=3, a(n)=4*a(n-1) + 3*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A189742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189742() {
    super(new long[] {3, 4}, new long[] {4, 3});
  }
}
