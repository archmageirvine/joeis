package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016135 Expansion of 1/((1-2*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016135() {
    super(new long[] {-22, 13}, new long[] {1, 13});
  }
}
