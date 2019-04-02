package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098183 a(n)=3a(n-1)+a(n-3), a(0)=1,a(1)=1,a(2)=4.
 * @author Sean A. Irvine
 */
public class A098183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098183() {
    super(new long[] {1, 0, 3}, new long[] {1, 1, 4});
  }
}
