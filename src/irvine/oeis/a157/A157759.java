package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157759.
 * @author Sean A. Irvine
 */
public class A157759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157759() {
    super(new long[] {1, -3, 3}, new long[] {500001, 21898963, 74859849});
  }
}
