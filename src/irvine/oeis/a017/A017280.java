package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017280 <code>a(n) = (10*n)^12</code>.
 * @author Sean A. Irvine
 */
public class A017280 implements Sequence {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(12);
  }
}

