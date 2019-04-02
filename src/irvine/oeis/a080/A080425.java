package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080425 Period 3: repeat [0, 2, 1].
 * @author Sean A. Irvine
 */
public class A080425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080425() {
    super(new long[] {1, 0, 0}, new long[] {0, 2, 1});
  }
}
