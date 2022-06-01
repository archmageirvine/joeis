package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101443 Continued fraction expansion of (I_0(1/2)/I_1(1/2)-1)/2 = 1.56185896... (where I_n is the modified Bessel function of the first kind).
 * @author Sean A. Irvine
 */
public class A101443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101443() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 1, 1, 3, 1, 1});
  }
}
