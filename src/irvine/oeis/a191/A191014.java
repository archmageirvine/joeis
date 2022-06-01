package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191014 a(n) = 10*a(n-1) + 2*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A191014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191014() {
    super(new long[] {2, 10}, new long[] {0, 1});
  }
}
