package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061777 Start with a single triangle; at n-th generation add a triangle at each vertex, allowing triangles to overlap; sequence gives total population of triangles at n-th generation.
 * @author Sean A. Irvine
 */
public class A061777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061777() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 4, 10, 22});
  }
}
