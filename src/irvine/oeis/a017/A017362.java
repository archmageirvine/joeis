package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017362 a(n) = (10*n + 7)^10.
 * @author Sean A. Irvine
 */
public class A017362 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(10);
  }
}

