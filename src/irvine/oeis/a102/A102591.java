package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102591 <code>a(n)=sum k=0..n, C(2n+1,2k)3^(n-k)</code>.
 * @author Sean A. Irvine
 */
public class A102591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102591() {
    super(new long[] {-4, 8}, new long[] {1, 6});
  }
}
