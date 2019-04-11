package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058310 <code>(1/2)*(n^2+n+2)*(n^2+3*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A058310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058310() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 44, 133, 319});
  }
}
