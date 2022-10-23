package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003504 a(0)=a(1)=1; thereafter a(n+1) = (1/n)*Sum_{k=0..n} a(k)^2 (a(n) is not always integral!).
 * @author Sean A. Irvine
 */
public class A003504 extends Sequence0 {

  private Z mS = Z.TWO;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= 44) {
      throw new UnsupportedOperationException("Sequence is not integral");
    }
    if (mN < 2) {
      return Z.ONE;
    }
    final Z res = mS.divide(mN - 1);
    mS = mS.add(res.square());
    return res;
  }
}

