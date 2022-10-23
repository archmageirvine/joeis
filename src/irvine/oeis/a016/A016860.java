package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016860 (5n)^12.
 * @author Sean A. Irvine
 */
public class A016860 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(12);
  }
}

