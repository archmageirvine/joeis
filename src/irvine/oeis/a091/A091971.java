package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091971.
 * @author Sean A. Irvine
 */
public class A091971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091971() {
    super(new long[] {1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {1, 0, 0, 1, 1, 2, 2, 1, 3});
  }
}
