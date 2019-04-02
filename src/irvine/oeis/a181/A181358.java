package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181358 Number of twiddle factors in the first stage of a Pease Radix 4 Fast Fourier Transform.
 * @author Sean A. Irvine
 */
public class A181358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181358() {
    super(new long[] {-4, 5}, new long[] {8, 44});
  }
}
