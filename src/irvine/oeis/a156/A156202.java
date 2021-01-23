package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156202 a(n)=2*a(n-1)+3 with n&gt;1, a(1)=10.
 * @author Sean A. Irvine
 */
public class A156202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156202() {
    super(new long[] {-2, 3}, new long[] {10, 23});
  }
}
