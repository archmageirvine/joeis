package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038845 3-fold convolution of A000302 (powers of 4).
 * @author Sean A. Irvine
 */
public class A038845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038845() {
    super(new long[] {64, -48, 12}, new long[] {1, 12, 96});
  }
}
