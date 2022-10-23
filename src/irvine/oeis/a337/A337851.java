package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A337851 a(n) = (2^n + 2)^n.
 * @author Georg Fischer
 */
public class A337851 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(2).pow(mN);
  }
}
