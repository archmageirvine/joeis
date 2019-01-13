package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008605.
 * @author Sean A. Irvine
 */
public class A008605 implements Sequence {

  private Z mN = Z.valueOf(-23);

  @Override
  public Z next() {
    mN = mN.add(23);
    return mN;
  }
}

