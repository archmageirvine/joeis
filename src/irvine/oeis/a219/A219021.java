package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219021 Sum of cubes of first n terms of Lucas sequence U(4,1) (A001353) divided by sum of their first powers.
 * @author Sean A. Irvine
 */
public class A219021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219021() {
    super(1, new long[] {1, -19, 76, -76, 19}, new long[] {1, 13, 172, 2356, 32661});
  }
}
