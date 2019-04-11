package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106854 Expansion of <code>1/(1-x*(1-5*x))</code>.
 * @author Sean A. Irvine
 */
public class A106854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106854() {
    super(new long[] {-5, 1}, new long[] {1, 1});
  }
}
