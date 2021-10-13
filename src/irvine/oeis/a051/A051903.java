package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051903 Maximal exponent in prime factorization of n.
 * @author Sean A. Irvine
 */
public class A051903 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(++mN).maxExponent());
  }
}
