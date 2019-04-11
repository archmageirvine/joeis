package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125880 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks at least one of the digits <code>1,2</code> and at least one of the digits <code>3,4,5,6,7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A125880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125880() {
    super(new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {10, 98, 946, 9026, 85330, 800738, 7463746, 69054146});
  }
}
