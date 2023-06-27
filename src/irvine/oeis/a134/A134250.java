package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134250 Expansion of x*(4+9*x-7*x^2) / ((1-x)*(1+3*x-x^2)).
 * @author Sean A. Irvine
 */
public class A134250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134250() {
    super(1, new long[] {-1, 4, -2}, new long[] {4, 1, 7});
  }
}
