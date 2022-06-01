package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016136 Expansion of 1/((1-2*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016136() {
    super(new long[] {-24, 14}, new long[] {1, 14});
  }
}
