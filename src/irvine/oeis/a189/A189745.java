package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189745 a(n) = 5*a(n-1) + a(n-2); with a(1)=5, a(2)=1.
 * @author Sean A. Irvine
 */
public class A189745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189745() {
    super(new long[] {1, 5}, new long[] {5, 1});
  }
}
