package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146078 Expansion of <code>1/(1-x*(1-9*x))</code>.
 * @author Sean A. Irvine
 */
public class A146078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146078() {
    super(new long[] {-9, 1}, new long[] {1, 1});
  }
}
