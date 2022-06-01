package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096885 Related to diagonals of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A096885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096885() {
    super(new long[] {1, 100}, new long[] {1, 100});
  }
}
