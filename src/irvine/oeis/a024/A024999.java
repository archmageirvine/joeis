package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024999 Expansion of 1/((1-x)(1-8x)(1-10x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A024999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024999() {
    super(new long[] {-880, 1158, -307, 30}, new long[] {1, 30, 593, 9738});
  }
}
