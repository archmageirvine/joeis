package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081437 Diagonal in array of n-gonal numbers A081422.
 * @author Sean A. Irvine
 */
public class A081437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081437() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 10, 33, 76});
  }
}
