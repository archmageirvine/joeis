package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024210 Number of terms in n-th derivative of a function composed with itself 10 times.
 * @author Sean A. Irvine
 */
public class A024210 extends A024207 {

  @Override
  public Z next() {
    return get(++mN, 10L);
  }
}
