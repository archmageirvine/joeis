package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052534.
 * @author Sean A. Irvine
 */
public class A052534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052534() {
    super(new long[] {-1, 1, 2}, new long[] {1, 2, 4});
  }
}
