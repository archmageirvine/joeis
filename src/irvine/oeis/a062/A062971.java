package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062971 a(n) = (2*n)^n.
 * @author Georg Fischer
 */
public class A062971 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(2L * mN).pow(mN);
  }
}
