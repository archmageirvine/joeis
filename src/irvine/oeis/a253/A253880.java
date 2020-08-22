package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253880 Triangular numbers (A000217) that are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253880() {
    super(new long[] {-1, 254}, new long[] {1, 253});
  }
}
