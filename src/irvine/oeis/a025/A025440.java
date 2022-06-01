package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025440 Expansion of 1/((1-2x)(1-3x)(1-4x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A025440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025440() {
    super(new long[] {-144, 180, -80, 15}, new long[] {1, 15, 145, 1155});
  }
}
