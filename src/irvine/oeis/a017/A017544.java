package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017544 (12n+1)^12.
 * @author Sean A. Irvine
 */
public class A017544 implements Sequence {

  private Z mN = Z.valueOf(-11);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

