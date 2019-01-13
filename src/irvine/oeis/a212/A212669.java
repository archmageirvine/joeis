package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212669.
 * @author Sean A. Irvine
 */
public class A212669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212669() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {18, 340, 2022, 7400, 20602, 48060});
  }
}
