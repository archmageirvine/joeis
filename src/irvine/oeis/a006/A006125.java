package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006125 a(n) = 2^(n*(n-1)/2).
 * @author Sean A. Irvine
 */
public class A006125 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft((long) mN * ++mN / 2);
  }
}
