package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a035.A035324;

/**
 * A045894 4-fold convolution of A001700(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A045894 extends A035324 {

  {
    setOffset(0);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, 4L);
  }
}

