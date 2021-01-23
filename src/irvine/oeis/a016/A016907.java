package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016907 (5n+4)^11.
 * @author Sean A. Irvine
 */
public class A016907 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(11);
  }
}

