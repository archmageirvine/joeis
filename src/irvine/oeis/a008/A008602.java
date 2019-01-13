package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008602.
 * @author Sean A. Irvine
 */
public class A008602 implements Sequence {

  private Z mN = Z.valueOf(-20);

  @Override
  public Z next() {
    mN = mN.add(20);
    return mN;
  }
}

