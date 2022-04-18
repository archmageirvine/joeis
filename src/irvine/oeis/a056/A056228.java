package irvine.oeis.a056;

import irvine.oeis.a000.A000010;
import irvine.oeis.transform.LittleHankelTransform;

/**
 * A056228 Image of Euler totient function (A000010) under "little Hankel" transform that sends [c_0, c_1, ...] to [d_0, d_1, ...] where d_n = c_n^2 - c_{n+1}*c_{n-1}.
 * @author Sean A. Irvine
 */
public class A056228 extends LittleHankelTransform {

  /** Construct the sequence. */
  public A056228() {
    super(new A000010());
  }
}
