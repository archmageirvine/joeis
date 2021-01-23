package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033813 Convolution of natural numbers n &gt;= 1 with Lucas numbers L(k)(A000032) for k &gt;= 3.
 * @author Sean A. Irvine
 */
public class A033813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033813() {
    super(new long[] {1, -1, -2, 3}, new long[] {4, 15, 37, 77});
  }
}
