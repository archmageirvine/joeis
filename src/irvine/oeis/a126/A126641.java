package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126641 <code>a(n)</code> is the number of integers k less than <code>10^n</code> such that the decimal representation of k lacks the digit <code>1,</code> at least one of digits <code>2,3,</code> at least one of digits <code>4,5,</code> at least one of digits <code>6,7</code> and at least one of digits <code>8,9</code>.
 * @author Sean A. Irvine
 */
public class A126641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126641() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {9, 73, 537, 3625, 22809});
  }
}
