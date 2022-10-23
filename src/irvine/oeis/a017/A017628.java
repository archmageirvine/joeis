package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017628 (12n+8)^12.
 * @author Sean A. Irvine
 */
public class A017628 extends Sequence0 {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

