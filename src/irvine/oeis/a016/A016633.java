package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016633 Expansion of 1/((1-2x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016633() {
    super(new long[] {264, -178, 25}, new long[] {1, 25, 447});
  }
}
