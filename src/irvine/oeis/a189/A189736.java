package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189736 a(1)=3,  a(2)=2, a(n)=3*a(n-1) + 2*a(n-2).
 * @author Sean A. Irvine
 */
public class A189736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189736() {
    super(new long[] {2, 3}, new long[] {3, 2});
  }
}
