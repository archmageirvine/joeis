package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007586 <code>11-gonal</code> (or hendecagonal) pyramidal numbers: <code>n(n+1)(3n-2)/2</code>.
 * @author Sean A. Irvine
 */
public class A007586 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).multiply(3 * mN - 5).divide2();
  }
}
