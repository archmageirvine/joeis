package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165230 <code>a(0)=1, a(1)=7, a(n)=14*a(n-1)-7*a(n-2)</code> for <code>n&gt;1 </code>.
 * @author Sean A. Irvine
 */
public class A165230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165230() {
    super(new long[] {-7, 14}, new long[] {1, 7});
  }
}
