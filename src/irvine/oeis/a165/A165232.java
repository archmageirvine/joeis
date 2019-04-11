package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165232 <code>a(0)=1, a(1)=9, a(n)=18*a(n-1)-9*a(n-2)</code> for <code>n&gt;1 </code>.
 * @author Sean A. Irvine
 */
public class A165232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165232() {
    super(new long[] {-9, 18}, new long[] {1, 9});
  }
}
