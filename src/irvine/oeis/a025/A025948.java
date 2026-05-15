package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025948 Expansion of 1/((1-2*x)*(1-3*x)*(1-8*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A025948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025948() {
    super(new long[] {-432, 462, -163, 22}, new long[] {1, 22, 321, 3938});
  }
}
