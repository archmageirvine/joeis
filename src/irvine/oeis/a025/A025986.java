package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025986 Expansion of 1/((1-2*x)*(1-5*x)*(1-6*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A025986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025986() {
    super(new long[] {-420, 424, -143, 20}, new long[] {1, 20, 257, 2704});
  }
}
