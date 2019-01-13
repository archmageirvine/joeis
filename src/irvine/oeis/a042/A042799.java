package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042799.
 * @author Sean A. Irvine
 */
public class A042799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042799() {
    super(new long[] {-1, 0, 122, 0}, new long[] {1, 2, 121, 244});
  }
}
