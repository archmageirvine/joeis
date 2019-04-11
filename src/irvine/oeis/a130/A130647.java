package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130647 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+839)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A130647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130647() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 60, 2241, 2517, 2821, 15180, 16780});
  }
}
