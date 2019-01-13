package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037793.
 * @author Sean A. Irvine
 */
public class A037793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037793() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {3, 14, 57, 228, 915});
  }
}
