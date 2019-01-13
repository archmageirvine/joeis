package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123095.
 * @author Sean A. Irvine
 */
public class A123095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123095() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 1, 2049, 179196, 4373500, 53201625, 415998681, 2393325424L, 10983260016L, 42364319625L, 142364319625L, 427675990236L, 1170684360924L});
  }
}
