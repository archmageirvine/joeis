package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144109 INVERT transform of the cubes <code>A000578</code>.
 * @author Sean A. Irvine
 */
public class A144109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144109() {
    super(new long[] {-1, 5, -2, 5}, new long[] {1, 9, 44, 207});
  }
}
