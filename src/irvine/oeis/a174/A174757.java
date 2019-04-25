package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174757 x-values in the solution to <code>x^2-53*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174757() {
    super(new long[] {-1, 132498}, new long[] {1, 66249});
  }
}
