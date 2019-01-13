package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141325.
 * @author Sean A. Irvine
 */
public class A141325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141325() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {1, 1, 1, 1, 3});
  }
}
