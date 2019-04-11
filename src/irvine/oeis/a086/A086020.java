package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086020 <code>a(n) =</code> Sum_(i=1..n) C(i+2,3)^2 [ Sequential sums of the tetragonal numbers or "tetras" (pyramidal, square) raised to power 2 (drawn from the 4th diagonal - left or right - of Pascal's Triangle) ].
 * @author Sean A. Irvine
 */
public class A086020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086020() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 17, 117, 517, 1742, 4878, 11934, 26334});
  }
}
