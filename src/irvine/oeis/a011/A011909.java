package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011909 a(n) = floor( n*(n-1)*(n-2)/27 ).
 * @author Sean A. Irvine
 */
public class A011909 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(++mN).divide(27);
  }
}
