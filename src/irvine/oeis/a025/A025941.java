package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025941 Expansion of 1/((1-2*x)*(1-3*x)*(1-6*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A025941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025941() {
    super(new long[] {-396, 432, -157, 22}, new long[] {1, 22, 327, 4172});
  }
}
