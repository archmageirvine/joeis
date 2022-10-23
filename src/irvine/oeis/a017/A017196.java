package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017196 a(n) = (9*n + 2)^12.
 * @author Sean A. Irvine
 */
public class A017196 extends Sequence0 {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(12);
  }
}

