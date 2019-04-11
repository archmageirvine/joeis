package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007585 10-gonal (or decagonal) pyramidal numbers: <code>a(n) = n*(n + 1)*(8*n - 5)/6</code>.
 * @author Sean A. Irvine
 */
public class A007585 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).multiply(8 * mN - 13).divide(6);
  }
}
