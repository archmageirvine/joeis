package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014896 a(1)=1, a(n)=13*a(n-1)+n.
 * @author Sean A. Irvine
 */
public class A014896 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(13).add(mN);
    }
    return mA;
  }
}
