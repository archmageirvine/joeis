package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205084.
 * @author Sean A. Irvine
 */
public class A205084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205084() {
    super(new long[] {-10, 11}, new long[] {11, 141});
  }
}
