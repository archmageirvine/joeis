package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000533 <code>a(0)=1; a(n) = 10^n + 1, n &gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A000533 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.TEN.pow(++mN).add(1).subtract(Z.ZERO.pow(mN));
  }
}
