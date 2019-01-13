package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118485.
 * @author Sean A. Irvine
 */
public class A118485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118485() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {43, 47, 131, 397, 12251});
  }
}
