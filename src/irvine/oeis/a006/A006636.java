package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006636 a(n) = (n + 1)*(n + 2)*(n + 4)*(n + 8)*(n + 15)/120.
 * @author Sean A. Irvine
 */
public class A006636 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN + 1).multiply(mN + 3).multiply(mN + 7).multiply(mN + 14).divide(120);
  }
}

