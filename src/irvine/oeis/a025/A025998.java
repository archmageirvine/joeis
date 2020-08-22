package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025998 Expansion of 1/((1-2x)(1-5x)(1-8x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A025998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025998() {
    super(new long[] {-800, 740, -216, 25}, new long[] {1, 25, 409, 5565});
  }
}
