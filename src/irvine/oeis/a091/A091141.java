package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091141.
 * @author Sean A. Irvine
 */
public class A091141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091141() {
    super(new long[] {-2, 4, 2}, new long[] {1, 4, 13});
  }
}
