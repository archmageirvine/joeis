package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011199 a(n) = (n+1)*(2*n+1)*(3*n+1).
 * @author Sean A. Irvine
 */
public class A011199 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 1).multiply(2 * mN + 1).multiply(3 * mN + 1);
  }
}

