package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058195 Areas of a sequence of right-angled figures described below.
 * @author Sean A. Irvine
 */
public class A058195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058195() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 7, 23, 57, 118, 218});
  }
}
