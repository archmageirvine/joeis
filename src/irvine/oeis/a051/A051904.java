package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051904 Minimal exponent in prime factorization of n.
 * @author Sean A. Irvine
 */
public class A051904 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(++mN).minExponent());
  }
}
