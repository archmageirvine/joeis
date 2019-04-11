package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153435 Numbers with <code>2n</code> binary digits where every run length is <code>2,</code> written in binary.
 * @author Sean A. Irvine
 */
public class A153435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153435() {
    super(new long[] {-100, 1, 100}, new long[] {11, 1100, 110011});
  }
}
