package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054339 9-fold convolution of <code>A000302 (powers</code> of <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A054339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054339() {
    super(new long[] {262144, -589824, 589824, -344064, 129024, -32256, 5376, -576, 36}, new long[] {1, 36, 720, 10560, 126720, 1317888, 12300288, 105431040, 843448320});
  }
}
