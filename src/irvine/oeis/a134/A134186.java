package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134186 Expansion of -x*(5*x^4+5*x^3-7*x-4)/((x^2-x-1)*(x^3+x^2-1)).
 * @author Sean A. Irvine
 */
public class A134186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134186() {
    super(1, new long[] {-1, 0, 2, 2, -1}, new long[] {4, 3, 5, 4, 7});
  }
}
