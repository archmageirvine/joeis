package irvine.oeis.a070;
// manually

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070529 Number of divisors of repunit 111...111 (with n digits).
 * @author Georg Fischer
 */
public class A070529 implements Sequence {

  protected Z mK = Z.ONE;
  
  @Override
  public Z next() {
    final Z result = Cheetah.factor(mK).sigma0();
    mK = mK.multiply(Z.TEN).add(Z.ONE);
    return result;
  }
}
