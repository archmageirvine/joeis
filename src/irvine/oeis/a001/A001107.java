package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001107 10-gonal (or decagonal) numbers: a(n) = n*(4*n-3).
 * @author Sean A. Irvine
 */
public class A001107 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.shiftLeft(2).subtract(3));
  }
}

