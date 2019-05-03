package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086020 <code>a(n) = Sum_(i=1..n) C(i+2,3)^2 [</code> Sequential sums of the tetragonal numbers or "tetras" <code>(pyramidal, square)</code> raised to power <code>2 (drawn</code> from the 4th diagonal - left or right - of Pascal's <code>Triangle) ]</code>.
 * @author Sean A. Irvine
 */
public class A086020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086020() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 17, 117, 517, 1742, 4878, 11934, 26334});
  }
}
