package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011905 a(n) = floor( n*(n-1)*(n-2)/23 ).
 * @author Sean A. Irvine
 */
public class A011905 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(++mN).divide(23);
  }
}
