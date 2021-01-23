package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038057 a(n) = 2^n*n^(n-1).
 * @author Sean A. Irvine
 */
public class A038057 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 1).shiftLeft(mN);
  }
}
