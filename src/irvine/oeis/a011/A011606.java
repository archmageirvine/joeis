package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011606 Legendre symbol (n,109).
 * @author Sean A. Irvine
 */
public class A011606 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, 109));
  }
}
