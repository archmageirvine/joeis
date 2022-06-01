package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133257 The number of edges on a piece of paper that has been folded n times (see comments for more precise definition).
 * @author Sean A. Irvine
 */
public class A133257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133257() {
    super(new long[] {-2, 2, 1}, new long[] {4, 7, 11});
  }
}
