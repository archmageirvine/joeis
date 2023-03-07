package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062207 a(n) = 2*n^n-1.
 * @author Sean A. Irvine
 */
public class A062207 extends Sequence0 {

  private long mN = -1;
  
  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).multiply2().subtract(1);
  }
}
