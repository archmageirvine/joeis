package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016133 Expansion of 1/((1-2*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A016133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016133() {
    super(new long[] {-18, 11}, new long[] {1, 11});
  }
}
