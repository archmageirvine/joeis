package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042539.
 * @author Sean A. Irvine
 */
public class A042539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042539() {
    super(new long[] {-1, 0, 226, 0}, new long[] {1, 4, 225, 904});
  }
}
