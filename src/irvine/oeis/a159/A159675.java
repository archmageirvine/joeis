package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159675 Expansion of x*(1 + x)/(1 - 32*x + x^2).
 * @author Sean A. Irvine
 */
public class A159675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159675() {
    super(1, new long[] {-1, 32}, new long[] {1, 33});
  }
}
