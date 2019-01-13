package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104683.
 * @author Sean A. Irvine
 */
public class A104683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104683() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 1, 5, 7});
  }
}
