package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017423 (11n+2)^11.
 * @author Sean A. Irvine
 */
public class A017423 implements Sequence {

  private Z mN = Z.valueOf(-9);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

