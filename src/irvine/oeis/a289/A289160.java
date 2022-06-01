package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289160 Number of 6-cycles in the n X n black bishop graph.
 * @author Sean A. Irvine
 */
public class A289160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289160() {
    super(new long[] {-1, 2, 5, -12, -9, 30, 5, -40, 5, 30, -9, -12, 5, 2}, new long[] {0, 0, 0, 15, 220, 1253, 5412, 15642, 44368, 97158, 218816, 410209, 797052, 1350435});
  }
}
