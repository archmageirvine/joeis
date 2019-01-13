package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232719.
 * @author Sean A. Irvine
 */
public class A232719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232719() {
    super(new long[] {16, 120, -135}, new long[] {-69, 9231, -1254465});
  }
}
