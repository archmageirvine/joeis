package irvine.math.function;

import java.util.function.BiFunction;

import irvine.math.z.Z;

/**
 * Wrap a two argument lambda as a function.
 * @author Sean A. Irvine
 */
class FunctionLambda2 extends AbstractFunction2 {

  private final BiFunction<Z, Z, Z> mLambda;

  FunctionLambda2(final BiFunction<Z, Z, Z> lambda) {
    mLambda = lambda;
  }

  @Override
  public Z z(final Z n, final Z m) {
    return mLambda.apply(n, m);
  }
}
