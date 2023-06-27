package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228317 The hyper-Wiener index of the triangular graph T(n) (n &gt;= 1).
 * @author Sean A. Irvine
 */
public class A228317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228317() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 3, 21, 75});
  }
}
