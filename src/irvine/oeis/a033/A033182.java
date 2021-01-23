package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033182 Number of pairs (p,q) such that 5*p + 6*q = n.
 * @author Sean A. Irvine
 */
public class A033182 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN / 5 - (mN - 1) / 6);
  }
}
