package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016190 Expansion of 1/((1-9*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016190() {
    super(new long[] {-99, 20}, new long[] {1, 20});
  }
}
