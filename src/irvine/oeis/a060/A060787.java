package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060787.
 * @author Sean A. Irvine
 */
public class A060787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060787() {
    super(new long[] {1, -3, 3}, new long[] {0, 18, 108});
  }
}
