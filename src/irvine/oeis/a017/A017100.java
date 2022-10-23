package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017100 a(n) = (8*n + 2)^12.
 * @author Sean A. Irvine
 */
public class A017100 extends Sequence0 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN.pow(12);
  }
}

