package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106852 Expansion of <code>1/(1-x*(1-3*x))</code>.
 * @author Sean A. Irvine
 */
public class A106852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106852() {
    super(new long[] {-3, 1}, new long[] {1, 1});
  }
}
