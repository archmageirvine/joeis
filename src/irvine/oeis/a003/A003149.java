package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003149 <code>a(n) =</code> Sum_{k=0..n} <code>k!(n-k)!</code>.
 * @author Sean A. Irvine
 */
public class A003149 implements Sequence {

  private Z mF = Z.ONE;
  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      mA = mA.multiply(mN + 1).divide2().add(mF);
    }
    return mA;
  }
}
