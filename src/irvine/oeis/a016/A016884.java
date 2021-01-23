package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016884 (5n+2)^12.
 * @author Sean A. Irvine
 */
public class A016884 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(12);
  }
}

