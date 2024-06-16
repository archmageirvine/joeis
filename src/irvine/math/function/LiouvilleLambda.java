package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Liouville lambda function.
 * @author Sean A. Irvine
 */
class LiouvilleLambda extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Z.valueOf(i(n));
  }

  @Override
  public int i(final Z n) {
    return Jaguar.factor(n).lambda();
  }
}
