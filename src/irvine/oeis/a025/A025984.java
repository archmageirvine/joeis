package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025984 Expansion of 1/((1-2*x)*(1-4*x)*(1-10*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A025984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025984() {
    super(new long[] {-960, 896, -260, 28}, new long[] {1, 28, 524, 8288});
  }
}
