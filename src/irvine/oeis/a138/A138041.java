package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138041 <code>a(1) = 1, a(2) = 10</code>; for <code>n&gt;2, a(n+1) = 4*a(n) + 6*a(n-1).</code> Also <code>a(n) =</code> upper left term in the 2 X 2 matrix <code>[1,3</code>; <code>3,3]</code>.
 * @author Sean A. Irvine
 */
public class A138041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138041() {
    super(new long[] {6, 4}, new long[] {1, 10});
  }
}
