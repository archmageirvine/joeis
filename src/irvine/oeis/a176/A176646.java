package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176646 a(n) is the number of convex pentagons in an n-triangular net.
 * @author Sean A. Irvine
 */
public class A176646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176646() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {0, 0, 3, 21, 78, 216, 498});
  }
}
