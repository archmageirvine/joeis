package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212701 Main transitions in systems of n particles with spin 3.
 * @author Sean A. Irvine
 */
public class A212701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212701() {
    super(new long[] {-49, 14}, new long[] {6, 84});
  }
}
