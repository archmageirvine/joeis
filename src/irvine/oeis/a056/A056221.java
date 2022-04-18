package irvine.oeis.a056;

import irvine.oeis.a000.A000040;
import irvine.oeis.transform.LittleHankelTransform;

/**
 * A056221 Image of primes (A000040) under "little Hankel" transform that sends [c_0, c_1, ...] to [d_0, d_1, ...] where d_n = c_n^2 - c_{n+1}*c_{n-1}.
 * @author Sean A. Irvine
 */
public class A056221 extends LittleHankelTransform {

  /** Construct the sequence. */
  public A056221() {
    super(new A000040());
  }
}
