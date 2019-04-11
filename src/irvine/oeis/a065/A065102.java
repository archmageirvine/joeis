package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065102 <code>a(0) =</code> c, <code>a(1) =</code> p*c^3; <code>a(n+2) =</code> p*c^2*a(n+1) <code>- a(n),</code> for p <code>= 2,</code> c <code>= 3</code>.
 * @author Sean A. Irvine
 */
public class A065102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065102() {
    super(new long[] {-1, 18}, new long[] {3, 54});
  }
}
