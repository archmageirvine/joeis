package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011621 Legendre symbol <code>(n,193)</code>.
 * @author Sean A. Irvine
 */
public class A011621 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, 193));
  }
}
