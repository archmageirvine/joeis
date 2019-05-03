package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098309 Unsigned member r <code>= -10</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098309() {
    super(new long[] {-1, 11, 11}, new long[] {0, 1, 10});
  }
}
