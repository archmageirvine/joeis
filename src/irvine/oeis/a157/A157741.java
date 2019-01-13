package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157741.
 * @author Sean A. Irvine
 */
public class A157741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157741() {
    super(new long[] {1, -3, 3}, new long[] {390727, 1559377, 3505951});
  }
}
