package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006516 <code>a(n) = 2^(n-1)*(2^n - 1), n &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A006516 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(1).shiftLeft(mN - 1);
  }
}
