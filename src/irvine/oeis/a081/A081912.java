package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081912.
 * @author Sean A. Irvine
 */
public class A081912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081912() {
    super(new long[] {216, -108, 18}, new long[] {1, 6, 37});
  }
}
