package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091685.
 * @author Sean A. Irvine
 */
public class A091685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091685() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 0, 0, 5, 0, 7, 0, 0, 0, 11});
  }
}
