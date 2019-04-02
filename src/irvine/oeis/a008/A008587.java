package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008587 Multiples of 5.
 * @author Sean A. Irvine
 */
public class A008587 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN;
  }
}

