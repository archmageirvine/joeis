package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083672 Binomial transform of 1,8,48,256,1280,6144,... (cf. A002697).
 * @author Sean A. Irvine
 */
public class A083672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083672() {
    super(new long[] {-9, -12, 2, 4}, new long[] {1, 1, 9, 25});
  }
}
