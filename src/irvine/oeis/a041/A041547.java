package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041547.
 * @author Sean A. Irvine
 */
public class A041547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041547() {
    super(new long[] {-1, 0, 580, 0}, new long[] {1, 17, 579, 9860});
  }
}
