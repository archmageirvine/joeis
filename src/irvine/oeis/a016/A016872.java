package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016872 (5n+1)^12.
 * @author Sean A. Irvine
 */
public class A016872 extends Sequence0 {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(12);
  }
}

