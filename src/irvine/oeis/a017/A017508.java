package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017508 a(n) = (11*n + 9)^12.
 * @author Sean A. Irvine
 */
public class A017508 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(12);
  }
}

