package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038845 3-fold convolution of <code>A000302 (powers</code> of <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A038845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038845() {
    super(new long[] {64, -48, 12}, new long[] {1, 12, 96});
  }
}
