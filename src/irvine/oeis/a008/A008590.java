package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008590.
 * @author Sean A. Irvine
 */
public class A008590 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN;
  }
}

