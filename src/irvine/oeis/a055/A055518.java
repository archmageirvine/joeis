package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055518 <code>a_{k+1} = 6*a_k + 11*a_{k-1} - 19*a_{k-2} - 4*a_{k-3} + a_{k-4}, a_1=1, a_2=2, a_3=19, a_4=118, a_5=875</code>.
 * @author Sean A. Irvine
 */
public class A055518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055518() {
    super(new long[] {1, -4, -19, 11, 6}, new long[] {1, 2, 19, 118, 875});
  }
}
