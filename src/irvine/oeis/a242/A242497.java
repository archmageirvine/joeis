package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242497 Sides of (Heronian) triangles where sides are consecutive integers and area is an integer.
 * @author Sean A. Irvine
 */
public class A242497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242497() {
    super(new long[] {-1, -1, -1, 4, 4, 4, -1, -1}, new long[] {3, 4, 5, 13, 14, 15, 51, 52});
  }
}
