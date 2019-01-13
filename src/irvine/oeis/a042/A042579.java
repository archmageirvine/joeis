package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042579.
 * @author Sean A. Irvine
 */
public class A042579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042579() {
    super(new long[] {1, 0, 0, 0, 0, 286, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 283, 288, 571, 859, 1430});
  }
}
