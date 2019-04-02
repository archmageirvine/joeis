package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016848 (4n+3)^12.
 * @author Sean A. Irvine
 */
public class A016848 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.pow(12);
  }
}

