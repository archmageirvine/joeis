package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163941 Fourth right hand column of triangle <code>A163940</code>.
 * @author Sean A. Irvine
 */
public class A163941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163941() {
    super(new long[] {-18, 39, -29, 9}, new long[] {1, 9, 52, 246});
  }
}
