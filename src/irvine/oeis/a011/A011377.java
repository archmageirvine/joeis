package irvine.oeis.a011;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A011377 Expansion of 1/((1-x)*(1-2*x)*(1-x^2)).
 * @author Sean A. Irvine
 */
public class A011377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011377() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 3, 8, 18});
  }
}

