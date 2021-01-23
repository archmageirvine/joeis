package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045543 6-fold convolution of A000302 (powers of 4); expansion of 1/(1-4*x)^6.
 * @author Sean A. Irvine
 */
public class A045543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045543() {
    super(new long[] {-4096, 6144, -3840, 1280, -240, 24}, new long[] {1, 24, 336, 3584, 32256, 258048});
  }
}
