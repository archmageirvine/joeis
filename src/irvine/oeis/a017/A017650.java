package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017650 a(n) = (12n+10)^10.
 * @author Sean A. Irvine
 */
public class A017650 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(10);
  }
}

