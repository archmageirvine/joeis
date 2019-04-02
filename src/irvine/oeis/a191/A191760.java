package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191760 Digital root of the n-th odd square.
 * @author Sean A. Irvine
 */
public class A191760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191760() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 9, 7, 4, 9, 4, 7, 9, 1});
  }
}
