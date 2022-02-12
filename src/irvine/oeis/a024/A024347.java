package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024347 Expansion of 1/((1-x)*(1-6*x)*(1-9*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A024347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024347() {
    super(new long[] {-648, 882, -261, 28}, new long[] {1, 28, 523, 8218});
  }
}
