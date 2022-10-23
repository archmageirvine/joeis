package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001088 Product of totient function: a(n) = Product_{k=1..n} phi(k) (cf. A000010).
 * @author Sean A. Irvine
 */
public class A001088 extends Sequence1 {

  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mP = mP.multiply(LongUtils.phi(++mN));
    return mP;
  }
}

