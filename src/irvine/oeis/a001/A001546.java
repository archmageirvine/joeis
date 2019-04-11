package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001546 <code>a(n) = (8*n+1)*(8*n+3)*(8*n+5)*(8*n+7)</code>.
 * @author Sean A. Irvine
 */
public class A001546 implements Sequence {

  private long mN = -7;

  @Override
  public Z next() {
    mN += 8;
    return Z.valueOf(mN).multiply(mN + 2).multiply(mN + 4).multiply(mN + 6);
  }
}
