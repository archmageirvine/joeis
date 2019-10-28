package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053088 <code>a(n) = 3*a(n-2) + 2*a(n-3)</code> for <code>n &gt; 2, a(0)=1, a(1)=0, a(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A053088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053088() {
    super(new long[] {2, 3, 0}, new long[] {1, 0, 3});
  }
}
