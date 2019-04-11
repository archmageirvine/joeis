package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017075 <code>a(n) = (8*n)^11</code>.
 * @author Sean A. Irvine
 */
public class A017075 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN.pow(11);
  }
}

