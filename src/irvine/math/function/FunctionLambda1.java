package irvine.math.function;

import java.util.function.Function;

import irvine.math.z.Z;

/**
 * Wrap a one argument lambda as a function.
 * @author Sean A. Irvine
 */
class FunctionLambda1 extends AbstractFunction1 {

  private final Function<Z, Z> mLambda;

  FunctionLambda1(final Function<Z, Z> lambda) {
    mLambda = lambda;
  }

  @Override
  public Z z(final Z n) {
    return mLambda.apply(n);
  }
}
