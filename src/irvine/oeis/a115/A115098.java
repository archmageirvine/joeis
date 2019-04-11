package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115098 <code>a(0)=2, a(n)=3*a(n-1)-3</code>.
 * @author Sean A. Irvine
 */
public class A115098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115098() {
    super(new long[] {-3, 4}, new long[] {2, 3});
  }
}
