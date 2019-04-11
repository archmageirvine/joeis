package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063651 Number of ways to tile <code>a 7</code> X n rectangle with 1 X 1 and 2 X 2 tiles.
 * @author Sean A. Irvine
 */
public class A063651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063651() {
    super(new long[] {-32, -42, 116, 85, -138, -17, 30, 3}, new long[] {1, 1, 21, 85, 747, 4375, 31387, 202841});
  }
}
