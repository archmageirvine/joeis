package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008603.
 * @author Sean A. Irvine
 */
public class A008603 implements Sequence {

  private Z mN = Z.valueOf(-21);

  @Override
  public Z next() {
    mN = mN.add(21);
    return mN;
  }
}

