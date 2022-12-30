package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120663 Expansion of x*(67 +2476*x +38216*x^2 -124633*x^3 +129444*x^4)/((1-x)*(1+x)*(1-2*x)*(1+3*x)*(1-4*x)*(1-6*x)).
 * @author Sean A. Irvine
 */
public class A120663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120663() {
    super(new long[] {-144, 84, 152, -93, -7, 9}, new long[] {0, 67, 3079, 65458, 436705, 3325420});
  }
}
