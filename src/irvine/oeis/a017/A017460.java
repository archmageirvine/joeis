package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017460 <code>a(n) = (11*n + 5)^12</code>.
 * @author Sean A. Irvine
 */
public class A017460 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(12);
  }
}

