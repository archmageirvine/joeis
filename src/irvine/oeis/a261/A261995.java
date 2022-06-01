package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261995 The first of four consecutive positive integers the sum of the squares of which is equal to the sum of the squares of twenty-one consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A261995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261995() {
    super(new long[] {1, -1, 0, 0, -110, 110, 0, 0, 1}, new long[] {42, 123, 315, 1827, 4659, 13650, 34794, 201114, 512610});
  }
}
