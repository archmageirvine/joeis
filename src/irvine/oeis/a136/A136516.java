package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A136516 a(n) = (2^n+1)^n.
 * @author Georg Fischer
 */
public class A136516 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(1).pow(mN);
  }
}
