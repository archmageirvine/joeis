package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000537 Sum of first n cubes; or n-th triangular number squared.
 * @author Sean A. Irvine
 */
public class A000537 implements Sequence {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(3));
    return mS;
  }
}
