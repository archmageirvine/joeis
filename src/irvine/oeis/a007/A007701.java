package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007701 a(0) = 0; for n &gt; 0, a(n) = n^n*2^((n-1)^2).
 * @author Sean A. Irvine
 */
public class A007701 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Z.valueOf(mN).pow(mN).shiftLeft((mN - 1) * (mN - 1));
  }
}
