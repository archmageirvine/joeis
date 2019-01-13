package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165760.
 * @author Sean A. Irvine
 */
public class A165760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165760() {
    super(new long[] {-8, 9}, new long[] {1, -8});
  }
}
