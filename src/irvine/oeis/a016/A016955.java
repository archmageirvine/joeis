package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016955.
 * @author Sean A. Irvine
 */
public class A016955 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(11);
  }
}

