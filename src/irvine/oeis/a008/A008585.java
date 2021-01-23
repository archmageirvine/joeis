package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008585 a(n) = 3*n.
 * @author Sean A. Irvine
 */
public class A008585 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(3);
    return mN;
  }
}

