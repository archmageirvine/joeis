package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072065 Define a "piece" to consist of 3 mutually touching pennies welded together to form a triangle; sequence gives side lengths of triangles that can be made from such pieces.
 * @author Sean A. Irvine
 */
public class A072065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072065() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 9, 11, 12});
  }
}
