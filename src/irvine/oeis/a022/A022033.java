package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022033 Expansion of 1/((1-x)(1-5x)(1-6x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A022033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022033() {
    super(new long[] {-210, 317, -125, 19}, new long[] {1, 19, 236, 2426});
  }
}
