package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276915 Indices of triangular numbers in <code>A276914</code> which are also pentagonal.
 * @author Sean A. Irvine
 */
public class A276915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276915() {
    super(new long[] {-1, 13, 13}, new long[] {0, 1, 10});
  }
}
