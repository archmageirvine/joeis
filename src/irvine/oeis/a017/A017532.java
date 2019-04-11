package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017532 <code>a(n) = (12*n)^12</code>.
 * @author Sean A. Irvine
 */
public class A017532 implements Sequence {

  private Z mN = Z.valueOf(-12);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

