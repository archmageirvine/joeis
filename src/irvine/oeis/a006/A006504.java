package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006504 Coefficient of x^4 in (1-x-x^2)^(-n).
 * @author Sean A. Irvine
 */
public class A006504 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN + 1).multiply(mN + 3).multiply(mN + 14).divide(24);
  }
}

