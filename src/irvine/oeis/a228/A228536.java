package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228536 y-values in the solution to the Pell equation <code>x^2 -</code> 53*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A228536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228536() {
    super(new long[] {-1, 132498}, new long[] {25, 3312425});
  }
}
