package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010791 <code>a(n) = n!*(n+2)!/2</code>.
 * @author Sean A. Irvine
 */
public class A010791 implements Sequence {

  private long mN = 1;
  private Z mF0 = Z.ONE;
  private Z mF1 = Z.ONE;

  @Override
  public Z next() {
    final Z r = mF0;
    mF0 = mF1;
    mF1 = mF1.multiply(++mN);
    return r.multiply(mF1).divide2();
  }
}
