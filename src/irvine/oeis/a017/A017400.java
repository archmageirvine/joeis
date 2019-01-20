package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017400.
 * @author Sean A. Irvine
 */
public class A017400 implements Sequence {

  private Z mN = Z.valueOf(-11);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(12);
  }
}

