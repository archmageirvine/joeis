package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130748 Place n points on each of the three sides of a triangle, <code>3n</code> points in all; <code>a(n) =</code> number of nondegenerate triangles that can be constructed using these points (plus the 3 original vertices) as vertices.
 * @author Sean A. Irvine
 */
public class A130748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130748() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17, 72, 190, 395});
  }
}
