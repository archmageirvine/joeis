package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001264.
 * @author Sean A. Irvine
 */
public class A001264 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(mN);
    mN <<= 2;
    mN %= 100;
    return n;
  }
}
