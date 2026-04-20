package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025927 Expansion of 1/((1-2*x)*(1-3*x)*(1-4*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A025927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025927() {
    super(new long[] {-240, 284, -116, 19}, new long[] {1, 19, 245, 2735});
  }
}
