package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017520 a(n) = (11*n + 10)^12.
 * @author Sean A. Irvine
 */
public class A017520 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(12);
  }
}

