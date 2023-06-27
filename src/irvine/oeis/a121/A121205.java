package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121205 "666" in bases 7 and higher rewritten in base 10.
 * @author Sean A. Irvine
 */
public class A121205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121205() {
    super(7, new long[] {1, -3, 3}, new long[] {342, 438, 546});
  }
}
