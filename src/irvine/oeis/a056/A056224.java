package irvine.oeis.a056;

import irvine.oeis.a000.A000005;
import irvine.oeis.transform.LittleHankelTransform;

/**
 * A056224 Image of number of divisors sequence (A000005) under "little Hankel" transform that sends [c_0, c_1, ...] to [d_0, d_1, ...] where d_n = c_n^2 - c_{n+1}*c_{n-1}.
 * @author Sean A. Irvine
 */
public class A056224 extends LittleHankelTransform {

  /** Construct the sequence. */
  public A056224() {
    super(new A000005());
  }
}
