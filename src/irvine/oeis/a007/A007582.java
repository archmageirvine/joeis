package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007582.
 * @author Sean A. Irvine
 */
public class A007582 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(1).shiftLeft(mN - 1);
  }
}
