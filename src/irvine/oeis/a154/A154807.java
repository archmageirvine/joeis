package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154807 Numbers with 5n binary digits where every run length is 5, written in binary.
 * @author Sean A. Irvine
 */
public class A154807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154807() {
    super(1, new long[] {-100000, 1, 100000}, new long[] {11111, 1111100000, 111110000011111L});
  }
}
