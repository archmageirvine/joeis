package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001446 (4^n + 4^[ n/2 ] )/2.
 * @author Sean A. Irvine
 */
public class A001446 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN - 1).add(Z.ONE.shiftLeft(2 * (mN / 2) - 1));
  }
}
