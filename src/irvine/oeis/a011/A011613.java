package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011613 Legendre symbol <code>(n,151)</code>.
 * @author Sean A. Irvine
 */
public class A011613 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, 151));
  }
}
