package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052460 3-magic series constant.
 * @author Sean A. Irvine
 */
public class A052460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052460() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 50, 675, 4624, 21125, 73926, 214375, 540800});
  }
}
