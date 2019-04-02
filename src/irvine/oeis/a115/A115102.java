package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115102 a(0)=2, a(1)=8, a(n)=a(n-1)+2*a(n-2).
 * @author Sean A. Irvine
 */
public class A115102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115102() {
    super(new long[] {2, 1}, new long[] {2, 8});
  }
}
