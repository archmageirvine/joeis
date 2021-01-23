package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017255 a(n) = (9*n + 7)^11.
 * @author Sean A. Irvine
 */
public class A017255 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

