package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176712.
 * @author Sean A. Irvine
 */
public class A176712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176712() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {285, 2805, 9405, 22197, 43677});
  }
}
