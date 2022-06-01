package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153435 Numbers with 2n binary digits where every run length is 2, written in binary.
 * @author Sean A. Irvine
 */
public class A153435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153435() {
    super(new long[] {-100, 1, 100}, new long[] {11, 1100, 110011});
  }
}
