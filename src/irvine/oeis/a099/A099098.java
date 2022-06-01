package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099098 Quadrisection of a Padovan sequence.
 * @author Sean A. Irvine
 */
public class A099098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099098() {
    super(new long[] {1, 3, 2}, new long[] {1, 1, 4});
  }
}
