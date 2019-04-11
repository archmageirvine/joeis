package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011627 Legendre symbol <code>(n,229)</code>.
 * @author Sean A. Irvine
 */
public class A011627 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, 229));
  }
}
