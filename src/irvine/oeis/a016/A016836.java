package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016836.
 * @author Sean A. Irvine
 */
public class A016836 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.pow(12);
  }
}

