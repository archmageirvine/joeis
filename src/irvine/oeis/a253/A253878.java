package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253878 Indices of triangular numbers (A000217) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253878() {
    super(new long[] {1, -17, 17}, new long[] {1, 22, 358});
  }
}
