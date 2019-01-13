package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122788.
 * @author Sean A. Irvine
 */
public class A122788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122788() {
    super(new long[] {2, -2, 2}, new long[] {0, 1, 1});
  }
}
