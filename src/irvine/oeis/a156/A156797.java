package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156797.
 * @author Sean A. Irvine
 */
public class A156797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156797() {
    super(new long[] {-1, 1, 1}, new long[] {22, 59, 103});
  }
}
