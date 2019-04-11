package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139814 <code>a(n)=a(n-1)+a(n-2)+a(n-3)+2a(n-4)</code>; <code>a(0)=0,a(1)=1,a(2)=3,a(3)=7</code>.
 * @author Sean A. Irvine
 */
public class A139814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139814() {
    super(new long[] {2, 1, 1, 1}, new long[] {0, 1, 3, 7});
  }
}
