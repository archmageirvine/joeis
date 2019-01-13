package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000337.
 * @author Sean A. Irvine
 */
public class A000337 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).shiftLeft(mN + 1).add(1);
  }
}

