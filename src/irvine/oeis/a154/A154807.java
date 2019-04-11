package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154807 Numbers with <code>5n</code> binary digits where every run length is 5, written in binary.
 * @author Sean A. Irvine
 */
public class A154807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154807() {
    super(new long[] {-100000, 1, 100000}, new long[] {11111, 1111100000, 111110000011111L});
  }
}
