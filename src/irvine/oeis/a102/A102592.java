package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102592 <code>a(n)=sum k=0..n, C(2n+1,2k)5^(n-k)</code>.
 * @author Sean A. Irvine
 */
public class A102592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102592() {
    super(new long[] {-16, 12}, new long[] {1, 8});
  }
}
