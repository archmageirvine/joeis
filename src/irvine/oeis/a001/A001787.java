package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001787 a(n) = n*2^(n-1).
 * @author Sean A. Irvine
 */
public class A001787 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).shiftLeft(mN - 1);
  }
}
