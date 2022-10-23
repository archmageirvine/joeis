package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017328 a(n) = (10*n + 4)^12.
 * @author Sean A. Irvine
 */
public class A017328 extends Sequence0 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(12);
  }
}

