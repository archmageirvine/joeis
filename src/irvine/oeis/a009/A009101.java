package irvine.oeis.a009;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009101 Fixed point when iterating the function f on n, where f(x) = x + product of digits of x.
 * @author Sean A. Irvine
 */
public class A009101 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!Predicates.DIGIT_CONTAINS_ZERO.is(m)) {
      m = m.add(Functions.DIGIT_PRODUCT.z(m));
    }
    return m;
  }
}
