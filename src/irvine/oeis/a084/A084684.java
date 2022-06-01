package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084684 Degrees of certain maps (see Comments and Formulas for more precise definitions).
 * @author Sean A. Irvine
 */
public class A084684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084684() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 4, 8});
  }
}
