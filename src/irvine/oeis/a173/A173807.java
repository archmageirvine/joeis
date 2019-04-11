package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173807 <code>(7*10^n-43)/9</code> for <code>n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A173807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173807() {
    super(new long[] {-10, 11}, new long[] {3, 73});
  }
}
