package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266698 x-values of solutions to the Diophantine equation <code>x^2 -</code> 7*y^2 <code>= 2</code>.
 * @author Sean A. Irvine
 */
public class A266698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266698() {
    super(new long[] {-1, 16}, new long[] {3, 45});
  }
}
