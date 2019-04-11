package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146080 Expansion of <code>1/(1-x*(1-10*x))</code>.
 * @author Sean A. Irvine
 */
public class A146080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146080() {
    super(new long[] {-10, 1}, new long[] {1, 1});
  }
}
