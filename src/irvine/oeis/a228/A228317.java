package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228317 The hyper-Wiener index of the triangular graph <code>T(n) (n &gt;= 1)</code>.
 * @author Sean A. Irvine
 */
public class A228317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228317() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 3, 21, 75});
  }
}
