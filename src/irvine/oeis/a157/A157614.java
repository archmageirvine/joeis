package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157614.
 * @author Sean A. Irvine
 */
public class A157614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157614() {
    super(new long[] {1, -3, 3}, new long[] {29767, 118097, 264991});
  }
}
