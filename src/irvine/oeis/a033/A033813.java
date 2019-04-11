package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033813 Convolution of natural numbers <code>n &gt;= 1</code> with Lucas numbers L(k)(A000032) for k <code>&gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A033813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033813() {
    super(new long[] {1, -1, -2, 3}, new long[] {4, 15, 37, 77});
  }
}
