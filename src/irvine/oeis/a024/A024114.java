package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024114 Expansion of 1/((1-x)(1-6x)(1-8x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A024114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024114() {
    super(new long[] {-576, 792, -242, 27}, new long[] {1, 27, 487, 7407});
  }
}
