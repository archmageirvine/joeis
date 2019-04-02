package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008586 Multiples of 4.
 * @author Sean A. Irvine
 */
public class A008586 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN;
  }
}

