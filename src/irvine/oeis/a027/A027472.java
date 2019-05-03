package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027472 Third convolution of the powers of <code>3 (A000244)</code>.
 * @author Sean A. Irvine
 */
public class A027472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027472() {
    super(new long[] {27, -27, 9}, new long[] {1, 9, 54});
  }
}
