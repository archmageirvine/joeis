package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106854 Expansion of 1/(1-x*(1-5*x)).
 * @author Sean A. Irvine
 */
public class A106854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106854() {
    super(new long[] {-5, 1}, new long[] {1, 1});
  }
}
