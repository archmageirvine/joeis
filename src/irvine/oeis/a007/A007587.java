package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007587 12-gonal (or dodecagonal) pyramidal numbers: a(n) = n*(n+1)*(10*n-7)/6.
 * @author Sean A. Irvine
 */
public class A007587 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).multiply(10 * mN - 17).divide(6);
  }
}
