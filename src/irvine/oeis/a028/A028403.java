package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028403 Number of types of Boolean functions of n variables under a certain group.
 * @author Sean A. Irvine
 */
public class A028403 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(1).shiftLeft(mN + 1);
  }
}

