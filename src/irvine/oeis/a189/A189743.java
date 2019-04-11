package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189743 <code>a(1)=4, a(2)=4, a(n)=4*a(n-1) +</code> 4*a(n-2).
 * @author Sean A. Irvine
 */
public class A189743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189743() {
    super(new long[] {4, 4}, new long[] {4, 4});
  }
}
