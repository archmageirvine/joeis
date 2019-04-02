package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017279 a(n) = (10*n)^11.
 * @author Sean A. Irvine
 */
public class A017279 implements Sequence {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(11);
  }
}

