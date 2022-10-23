package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011626 Legendre symbol (n,227).
 * @author Sean A. Irvine
 */
public class A011626 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, 227));
  }
}
