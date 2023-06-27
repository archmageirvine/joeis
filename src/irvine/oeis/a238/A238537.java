package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238537 A fourth-order linear divisibility sequence related to the Pell numbers.
 * @author Sean A. Irvine
 */
public class A238537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238537() {
    super(1, new long[] {-1, 28, 202, 28}, new long[] {1, 42, 1379, 47124});
  }
}
