package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052527.
 * @author Sean A. Irvine
 */
public class A052527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052527() {
    super(new long[] {-1, 1, 1, 1}, new long[] {1, 0, 1, 2});
  }
}
