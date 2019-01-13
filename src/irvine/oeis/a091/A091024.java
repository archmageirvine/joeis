package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091024.
 * @author Sean A. Irvine
 */
public class A091024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091024() {
    super(new long[] {-1, -1, 3, 2}, new long[] {0, 1, 2, 7});
  }
}
