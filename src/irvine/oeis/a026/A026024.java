package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026024 Expansion of 1/((1-2*x)*(1-5*x)*(1-9*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A026024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026024() {
    super(new long[] {-900, 820, -233, 26}, new long[] {1, 26, 443, 6280});
  }
}
