package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193068 Generating primitive Pythagorean triangles by using (n, n+1) gives perimeters for each n. This sequence lists the sum of these perimeters for each n triangles.
 * @author Sean A. Irvine
 */
public class A193068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193068() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {12, 42, 98, 188});
  }
}
