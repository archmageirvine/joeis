package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253654 Indices of pentagonal numbers (A000326) which are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A253654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253654() {
    super(new long[] {1, -9, 9}, new long[] {1, 6, 46});
  }
}
