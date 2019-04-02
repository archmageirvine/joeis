package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008606 Multiples of 24.
 * @author Sean A. Irvine
 */
public class A008606 implements Sequence {

  private Z mN = Z.valueOf(-24);

  @Override
  public Z next() {
    mN = mN.add(24);
    return mN;
  }
}

