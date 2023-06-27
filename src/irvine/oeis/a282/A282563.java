package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282563 One third of the number of edges in the metrically regular triangulation of the n-th approximation of the Koch snowflake fractal.
 * @author Sean A. Irvine
 */
public class A282563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282563() {
    super(1, new long[] {-36, 13}, new long[] {1, 8});
  }
}
