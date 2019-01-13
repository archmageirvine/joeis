package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007583.
 * @author Sean A. Irvine
 */
public class A007583 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft(mN).add(1).divide(3);
  }
}
