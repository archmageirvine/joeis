package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053763 a(n) = 2^(n^2 - n).
 * @author Sean A. Irvine
 */
public class A053763 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN * mN - mN);
  }
}
