package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017231 a(n) = (9*n + 5)^11.
 * @author Sean A. Irvine
 */
public class A017231 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

