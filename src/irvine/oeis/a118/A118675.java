package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118675 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+47)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A118675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118675() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 16, 85, 141, 225, 616, 940});
  }
}
