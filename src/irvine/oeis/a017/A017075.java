package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017075.
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

