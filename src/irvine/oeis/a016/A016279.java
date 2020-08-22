package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016279 Expansion of 1/((1-2x)(1-3x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016279() {
    super(new long[] {60, -56, 15}, new long[] {1, 15, 169});
  }
}
