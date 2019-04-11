package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102592 a(n)=sum <code>k=0..n,</code> C(2n+1,2k)5^(n-k).
 * @author Sean A. Irvine
 */
public class A102592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102592() {
    super(new long[] {-16, 12}, new long[] {1, 8});
  }
}
