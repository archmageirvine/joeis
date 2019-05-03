package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253878 Indices of triangular numbers <code>(A000217)</code> which are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A253878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253878() {
    super(new long[] {1, -17, 17}, new long[] {1, 22, 358});
  }
}
