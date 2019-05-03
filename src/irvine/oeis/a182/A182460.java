package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182460 <code>(3/5)*2^(4n+1) - (1/5)</code>.
 * @author Sean A. Irvine
 */
public class A182460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182460() {
    super(new long[] {-16, 17}, new long[] {1, 19});
  }
}
