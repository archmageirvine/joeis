package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126635 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks the digits <code>1,2,3,</code> at least one of digits <code>4,5</code> and at least one of digits <code>6,7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A126635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126635() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {7, 47, 307, 1943, 11827});
  }
}
