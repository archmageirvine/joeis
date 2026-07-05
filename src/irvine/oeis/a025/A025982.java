package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025982 Expansion of 1/((1-2*x)*(1-4*x)*(1-9*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A025982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025982() {
    super(new long[] {-864, 816, -242, 27}, new long[] {1, 27, 487, 7431});
  }
}
