package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289232.
 * @author Sean A. Irvine
 */
public class A289232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289232() {
    super(new long[] {1, -8, 25, -32, -11, 88, -99, 0, 99, -88, 11, 32, -25, 8}, new long[] {0, 77, 2569, 31951, 223346, 1089665, 4161705, 13314461, 37246668, 93781829, 216901737, 467727523, 951014654, 1839155785});
  }
}
