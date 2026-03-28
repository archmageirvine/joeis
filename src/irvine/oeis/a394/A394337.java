package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A394337 The largest prime p which is less than n^2 and n is a primitive root modulo p, or 0 if n is a square.
 * @author Sean A. Irvine
 */
public class A394337 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (Predicates.SQUARE.is(++mN)) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    Z p = Functions.PREV_PRIME.z(n.square());
    while (!ZUtils.isPrimitiveRoot(n, p)) {
      p = Functions.PREV_PRIME.z(p);
    }
    return p;
  }
}

