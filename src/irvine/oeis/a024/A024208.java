package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024208 Number of terms in n-th derivative of a function composed with itself 8 times.
 * @author Sean A. Irvine
 */
public class A024208 extends A024207 {

  @Override
  public Z next() {
    return get(++mN, 8L);
  }
}
