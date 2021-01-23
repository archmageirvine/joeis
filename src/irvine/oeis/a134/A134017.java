package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134017 Period 9: repeat 1, 2, 4, 3, 5, 3, 4, 2, 1.
 * @author Sean A. Irvine
 */
public class A134017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134017() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 4, 3, 5, 3, 4, 2, 1});
  }
}
