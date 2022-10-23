package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017304 a(n) = (10*n + 2)^12.
 * @author Sean A. Irvine
 */
public class A017304 extends Sequence0 {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(12);
  }
}

