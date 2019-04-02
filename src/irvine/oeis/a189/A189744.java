package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189744 a(1)=4, a(2)=5, a(n) = 4*a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A189744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189744() {
    super(new long[] {5, 4}, new long[] {4, 5});
  }
}
