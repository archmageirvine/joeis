package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035330 5-fold convolution of A001700(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A035330 extends A035324 {

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 5L);
  }
}

