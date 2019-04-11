package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017040 <code>a(n) = (7*n + 4)^12</code>.
 * @author Sean A. Irvine
 */
public class A017040 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(12);
  }
}

