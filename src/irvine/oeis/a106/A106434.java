package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106434 The (1,1)-entry of the matrix A^n, where A = [0,1;2,3].
 * @author Sean A. Irvine
 */
public class A106434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106434() {
    super(new long[] {2, 3}, new long[] {0, 2});
  }
}
