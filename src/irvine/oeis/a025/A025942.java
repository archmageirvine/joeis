package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025942 Expansion of 1/((1-2*x)*(1-3*x)*(1-6*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A025942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025942() {
    super(new long[] {-432, 468, -168, 23}, new long[] {1, 23, 361, 4907});
  }
}
