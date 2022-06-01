package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025934 Expansion of 1/((1-2x)(1-3x)(1-5x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A025934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025934() {
    super(new long[] {-300, 340, -131, 20}, new long[] {1, 20, 269, 3100});
  }
}
