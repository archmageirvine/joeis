package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122015 Expansion of a rational g.f., see formula.
 * @author Sean A. Irvine
 */
public class A122015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122015() {
    super(1, new long[] {-1, -4, -6, -4, 1, 4, 3, 0}, new long[] {1, 11, 41, 54, 129, 256, 529, 1083});
  }
}
