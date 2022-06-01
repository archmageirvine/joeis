package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028093 Expansion of 1/((1-3x)(1-7x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A028093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028093() {
    super(new long[] {-1890, 1299, -301, 29}, new long[] {1, 29, 540, 8230});
  }
}
