package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001445 a(n) = (2^n + 2^[ n/2 ] )/2.
 * @author Sean A. Irvine
 */
public class A001445 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN - 1).add(Z.ONE.shiftLeft(mN / 2 - 1));
  }
}
