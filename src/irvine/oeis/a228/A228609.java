package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228609.
 * @author Sean A. Irvine
 */
public class A228609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228609() {
    super(new long[] {1, -3, 1, -13, 54, -42, 26, -58, 25, 5, 5}, new long[] {0, 1, 2, 10, 74, 417, 2614, 16438, 101622, 633063, 3941012});
  }
}
