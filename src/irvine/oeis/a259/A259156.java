package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259156 Positive triangular numbers (A000217) that are pentagonal numbers (A000326) divided by 2.
 * @author Sean A. Irvine
 */
public class A259156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259156() {
    super(new long[] {1, -1, -9602, 9602, 1}, new long[] {6, 105, 58311, 1008910, 559902916});
  }
}
