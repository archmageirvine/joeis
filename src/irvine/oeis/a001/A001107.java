package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001107 10-gonal (or decagonal) numbers: <code>a(n) = n*(4*n-3)</code>.
 * @author Sean A. Irvine
 */
public class A001107 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.shiftLeft(2).subtract(3));
  }
}

