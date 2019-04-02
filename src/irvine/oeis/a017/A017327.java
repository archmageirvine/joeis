package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017327 a(n) = (10*n + 4)^11.
 * @author Sean A. Irvine
 */
public class A017327 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(11);
  }
}

