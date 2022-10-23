package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011881 a(n) = floor(n*(n-1)/28).
 * @author Sean A. Irvine
 */
public class A011881 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(28);
  }
}
