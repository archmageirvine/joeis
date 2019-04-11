package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146083 Expansion of <code>1/(1 - x*(1 - 11*x))</code>.
 * @author Sean A. Irvine
 */
public class A146083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146083() {
    super(new long[] {-11, 1}, new long[] {1, 1});
  }
}
