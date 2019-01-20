package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017171.
 * @author Sean A. Irvine
 */
public class A017171 implements Sequence {

  private Z mN = Z.valueOf(-9);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

