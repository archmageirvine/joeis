package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017376 a(n) = (10*n + 8)^12.
 * @author Sean A. Irvine
 */
public class A017376 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(12);
  }
}

