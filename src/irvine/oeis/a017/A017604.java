package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017604 <code>a(n) = (12n+6)^12</code>.
 * @author Sean A. Irvine
 */
public class A017604 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

