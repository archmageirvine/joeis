package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025968 Expansion of 1/((1-2x)(1-4x)(1-6x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A025968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025968() {
    super(new long[] {-480, 488, -164, 22}, new long[] {1, 22, 320, 3920});
  }
}
