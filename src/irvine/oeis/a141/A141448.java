package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141448.
 * @author Sean A. Irvine
 */
public class A141448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141448() {
    super(new long[] {1, 1, 1, 1, 2}, new long[] {0, 1, 2, 5, 13});
  }
}
