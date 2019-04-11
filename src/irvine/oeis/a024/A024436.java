package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024436 Expansion of <code>1/((1-x)(1-6x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A024436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024436() {
    super(new long[] {-792, 1062, -299, 30}, new long[] {1, 30, 601, 10122});
  }
}
