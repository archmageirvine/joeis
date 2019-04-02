package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011893 [ n(n-1)(n-2)/11 ].
 * @author Sean A. Irvine
 */
public class A011893 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(++mN).divide(11);
  }
}
