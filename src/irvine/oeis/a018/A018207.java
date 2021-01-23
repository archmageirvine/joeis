package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018207 Expansion of 1/((1-3x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A018207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018207() {
    super(new long[] {360, -186, 25}, new long[] {1, 25, 439});
  }
}
