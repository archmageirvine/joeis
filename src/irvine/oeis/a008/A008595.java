package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008595 Multiples of 13.
 * @author Sean A. Irvine
 */
public class A008595 implements Sequence {

  private Z mN = Z.valueOf(-13);

  @Override
  public Z next() {
    mN = mN.add(13);
    return mN;
  }
}

