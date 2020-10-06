package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a035.A035324;

/**
 * A045720 3-fold convolution of A001700(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A045720 extends A035324 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 3L);
  }
}

