package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021044 Expansion of 1/((1-x)(1-2x)(1-3x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A021044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021044() {
    super(new long[] {-48, 94, -59, 14}, new long[] {1, 14, 137, 1186});
  }
}
