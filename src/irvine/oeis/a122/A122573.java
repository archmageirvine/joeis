package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122573.
 * @author Sean A. Irvine
 */
public class A122573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122573() {
    super(new long[] {-1, 0, 4, 0}, new long[] {1, 1, 1, 1});
  }
}
