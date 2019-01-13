package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122504.
 * @author Sean A. Irvine
 */
public class A122504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122504() {
    super(new long[] {-1, 3, 1, -7, 1, 3}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
