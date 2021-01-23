package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017063 a(n) = (7*n + 6)^11.
 * @author Sean A. Irvine
 */
public class A017063 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(11);
  }
}

