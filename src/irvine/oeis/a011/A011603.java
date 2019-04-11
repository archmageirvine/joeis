package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011603 Legendre symbol <code>(n,101)</code>.
 * @author Sean A. Irvine
 */
public class A011603 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, 101));
  }
}
