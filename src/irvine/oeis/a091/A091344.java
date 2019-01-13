package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091344.
 * @author Sean A. Irvine
 */
public class A091344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091344() {
    super(new long[] {6, -11, 6}, new long[] {0, 1, 7});
  }
}
