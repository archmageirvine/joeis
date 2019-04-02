package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060869 Number of n X n matrices over GF(4) with rank 1.
 * @author Sean A. Irvine
 */
public class A060869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060869() {
    super(new long[] {64, -84, 21}, new long[] {3, 75, 1323});
  }
}
