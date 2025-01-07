package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019040 Expansion of 1/((1-4*x)*(1-5*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A019040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019040() {
    super(new long[] {220, -119, 20}, new long[] {1, 20, 281});
  }
}
