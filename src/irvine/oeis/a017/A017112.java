package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017112 <code>a(n) = (8*n+3)^12</code>.
 * @author Sean A. Irvine
 */
public class A017112 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN.pow(12);
  }
}

