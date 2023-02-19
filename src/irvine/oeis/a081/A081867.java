package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081867 a(n)=sigma_11(2n-1).
 * @author Georg Fischer
 */
public class A081867 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Jaguar.factor(mN).sigma(11);
  }
}
