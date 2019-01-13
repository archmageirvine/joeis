package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118822.
 * @author Sean A. Irvine
 */
public class A118822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118822() {
    super(new long[] {-1, 0, 0, 0}, new long[] {2, -1, 0, -1});
  }
}
