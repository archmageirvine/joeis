package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022812 Number of terms in n-th derivative of a function composed with itself 4 times.
 * @author Sean A. Irvine
 */
public class A022812 extends A022811 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 4L);
  }
}
