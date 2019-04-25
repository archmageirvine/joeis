package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174761 x-values in the solution to <code>x^2-59*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174761() {
    super(new long[] {-1, 1060}, new long[] {1, 530});
  }
}
