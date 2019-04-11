package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165312 <code>a(0)=1, a(1)=5, a(n)=11*a(n-1)-25*a(n-2)</code> for <code>n&gt;1</code>.
 * @author Sean A. Irvine
 */
public class A165312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165312() {
    super(new long[] {-25, 11}, new long[] {1, 5});
  }
}
