package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101986 Maximum sum of products of successive pairs in a permutation of order n+1.
 * @author Sean A. Irvine
 */
public class A101986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101986() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 9, 23});
  }
}
