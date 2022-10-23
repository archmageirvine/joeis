package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004771 a(n) = 8*n + 7. Or, numbers whose binary expansion ends in 111.
 * @author Sean A. Irvine
 */
public class A004771 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN;
  }
}

