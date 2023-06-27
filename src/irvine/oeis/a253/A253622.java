package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253622 Centered heptagonal numbers (A069099) which are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A253622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253622() {
    super(1, new long[] {1, -143, 143}, new long[] {1, 106, 15016});
  }
}
