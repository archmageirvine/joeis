package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024435 Expansion of 1/((1-x)(1-6x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A024435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024435() {
    super(new long[] {-720, 972, -280, 29}, new long[] {1, 29, 561, 9121});
  }
}
