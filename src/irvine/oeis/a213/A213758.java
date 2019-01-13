package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213758.
 * @author Sean A. Irvine
 */
public class A213758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213758() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 9, 40, 130, 355});
  }
}
