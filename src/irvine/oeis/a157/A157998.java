package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157998 169n^2 - n.
 * @author Sean A. Irvine
 */
public class A157998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157998() {
    super(new long[] {1, -3, 3}, new long[] {168, 674, 1518});
  }
}
