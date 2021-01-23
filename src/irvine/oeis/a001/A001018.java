package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001018 Powers of 8: a(n) = 8^n.
 * @author Sean A. Irvine
 */
public class A001018 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.shiftLeft(3);
    return mN;
  }
}
