package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016968.
 * @author Sean A. Irvine
 */
public class A016968 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

