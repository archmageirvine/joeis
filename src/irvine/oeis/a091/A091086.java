package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091086.
 * @author Sean A. Irvine
 */
public class A091086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091086() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 2, 5});
  }
}
