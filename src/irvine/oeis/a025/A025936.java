package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025936 Expansion of 1/((1-2x)(1-3x)(1-5x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A025936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025936() {
    super(new long[] {-360, 402, -151, 22}, new long[] {1, 22, 333, 4406});
  }
}
