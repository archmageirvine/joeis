package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253921 Indices of octagonal numbers (A000567) which are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A253921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253921() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {1, 51, 271, 24421, 130461});
  }
}
