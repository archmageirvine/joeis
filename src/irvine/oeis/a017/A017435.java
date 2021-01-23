package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017435 (11n+3)^11.
 * @author Sean A. Irvine
 */
public class A017435 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

