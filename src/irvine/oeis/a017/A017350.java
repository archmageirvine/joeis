package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017350 a(n) = (10*n + 6)^10.
 * @author Sean A. Irvine
 */
public class A017350 extends Sequence0 {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(10);
  }
}

