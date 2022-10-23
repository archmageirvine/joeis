package irvine.oeis.a326;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A326011 a(n) = (n+1) * (2^n + 1)^n.
 * @author Georg Fischer
 */
public class A326011 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(1).pow(mN).multiply(mN + 1);
  }
}
