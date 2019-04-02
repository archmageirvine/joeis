package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001025 Powers of 16: a(n) = 16^n.
 * @author Sean A. Irvine
 */
public class A001025 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.shiftLeft(4);
    return mN;
  }
}
