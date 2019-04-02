package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017495 (11n+8)^11.
 * @author Sean A. Irvine
 */
public class A017495 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

