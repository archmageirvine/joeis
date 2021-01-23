package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017436 (11n+3)^12.
 * @author Sean A. Irvine
 */
public class A017436 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(12);
  }
}

