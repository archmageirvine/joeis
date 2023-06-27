package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123184 Expansion of -x*(3*x^4+9*x^3-29*x^2+12*x-1)/((x-1)*(x^4-3*x^3-27*x^2+12*x-1)).
 * @author Sean A. Irvine
 */
public class A123184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123184() {
    super(1, new long[] {-1, 4, 24, -39, 13}, new long[] {1, 1, 3, 15, 103});
  }
}
