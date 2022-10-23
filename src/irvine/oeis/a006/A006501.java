package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006501 Expansion of (1+x^2) / ( (1-x)^2 * (1-x^3)^2 ).
 * @author Sean A. Irvine
 */
public class A006501 extends Sequence0 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 3).multiply((mN + 1) / 3).multiply((mN + 2) / 3);
  }
}

