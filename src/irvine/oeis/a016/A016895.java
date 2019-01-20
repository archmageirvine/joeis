package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016895.
 * @author Sean A. Irvine
 */
public class A016895 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(11);
  }
}

