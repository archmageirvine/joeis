package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157055.
 * @author Sean A. Irvine
 */
public class A157055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157055() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {2, 36, 362, 2570, 14240, 65226, 256508, 889716, 2777370, 7925720, 20934474, 51697802, 120353324});
  }
}
