package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165224 <code>a(0)=1, a(1)=9, a(n)=18*a(n-1)-49*a(n-2)</code> for <code>n&gt;1 </code>.
 * @author Sean A. Irvine
 */
public class A165224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165224() {
    super(new long[] {-49, 18}, new long[] {1, 9});
  }
}
