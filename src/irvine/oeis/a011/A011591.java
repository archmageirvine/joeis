package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011591 Legendre symbol <code>(n,43)</code>.
 * @author Sean A. Irvine
 */
public class A011591 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, 43));
  }
}
