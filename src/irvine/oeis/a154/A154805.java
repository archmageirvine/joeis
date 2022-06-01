package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154805 Numbers with 4n binary digits where every run length is 4, written in binary.
 * @author Sean A. Irvine
 */
public class A154805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154805() {
    super(new long[] {-10000, 1, 10000}, new long[] {1111, 11110000, 111100001111L});
  }
}
