package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284700 Number of edge covers in the n-antiprism graph.
 * @author Sean A. Irvine
 */
public class A284700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284700() {
    super(new long[] {-4, 1, 18, 13}, new long[] {4, 13, 205, 2902});
  }
}
