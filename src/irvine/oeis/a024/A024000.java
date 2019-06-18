package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024000 <code>a(n) = 1 - n</code>.
 * @author Sean A. Irvine
 */
public class A024000 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.subtract(1);
    return mN;
  }
}
