package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051903 Maximal exponent in prime factorization of n.
 * @author Sean A. Irvine
 */
public class A051903 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(++mN).maxExponent());
  }
}
