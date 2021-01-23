package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008592 Multiples of 10: a(n) = 10 * n.
 * @author Sean A. Irvine
 */
public class A008592 implements Sequence {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN;
  }
}

