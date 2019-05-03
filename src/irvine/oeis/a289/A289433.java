package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289433 Numbers <code>c_n</code> of Fibonacci-quilt legal decompositions of n.
 * @author Sean A. Irvine
 */
public class A289433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289433() {
    super(new long[] {1, 0, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 2, 2, 3, 4});
  }
}
