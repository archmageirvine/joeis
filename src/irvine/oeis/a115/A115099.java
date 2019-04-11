package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115099 <code>a(0)=4, a(n) = 3*a(n-1) - 4</code>.
 * @author Sean A. Irvine
 */
public class A115099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115099() {
    super(new long[] {-3, 4}, new long[] {4, 8});
  }
}
