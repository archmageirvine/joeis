package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055396 Smallest prime dividing n is a(n)-th prime (a(1)=0).
 * @author Sean A. Irvine
 */
public class A055396 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Puma.primePiZ(Jaguar.factor(mN).leastPrimeFactor());
  }
}
