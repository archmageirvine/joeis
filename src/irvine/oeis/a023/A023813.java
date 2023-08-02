package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023813 a(n) = n^(n*(n+1)/2).
 * @author Sean A. Irvine
 */
public class A023813 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow((long) mN * (mN + 1) / 2);
  }
}

