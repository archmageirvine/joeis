package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174755 x-values in the solution to <code>x^2-47*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174755() {
    super(new long[] {-1, 96}, new long[] {1, 48});
  }
}
