package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165188 Interleaving of A014125 and zero followed by A014125.
 * @author Sean A. Irvine
 */
public class A165188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165188() {
    super(new long[] {-1, 0, 3, 1, -3, -3, 1, 3, 0}, new long[] {1, 0, 3, 1, 6, 3, 11, 6, 18});
  }
}
