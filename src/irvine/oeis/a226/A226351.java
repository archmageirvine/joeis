package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226351 Number of ways to tile a fixed 3 X n square grid with 1 X <code>1, 2</code> X <code>2,</code> and 1 X 2 tiles.
 * @author Sean A. Irvine
 */
public class A226351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226351() {
    super(new long[] {6, 1, -26, 1, 19, 4}, new long[] {1, 3, 26, 163, 1125, 7546});
  }
}
