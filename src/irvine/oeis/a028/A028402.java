package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028402 Number of types of Boolean functions of n variables under a certain group.
 * @author Sean A. Irvine
 */
public class A028402 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(1).shiftLeft(mN);
  }
}

