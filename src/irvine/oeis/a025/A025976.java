package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025976 Expansion of 1/((1-2x)(1-4x)(1-8x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A025976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025976() {
    super(new long[] {-576, 568, -182, 23}, new long[] {1, 23, 347, 4363});
  }
}
