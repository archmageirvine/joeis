package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017507 a(n) = (11*n + 9)^11.
 * @author Sean A. Irvine
 */
public class A017507 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

