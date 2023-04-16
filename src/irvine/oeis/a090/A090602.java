package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A090602 Number of n-element labeled groupoids with an identity.
 * a(n) = n^((n-1)^2+1).
 * @author Georg Fischer
 */
public class A090602 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.valueOf(mN).pow((mN - 1) * (mN - 1) + 1);
  }
}
