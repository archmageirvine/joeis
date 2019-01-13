package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091052.
 * @author Sean A. Irvine
 */
public class A091052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091052() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 2, 13, 26});
  }
}
