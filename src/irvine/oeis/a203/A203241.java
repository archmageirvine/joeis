package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203241 Second elementary symmetric function of the first n terms of (1,2,4,8,...).
 * @author Sean A. Irvine
 */
public class A203241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203241() {
    super(new long[] {8, -14, 7}, new long[] {2, 14, 70});
  }
}
