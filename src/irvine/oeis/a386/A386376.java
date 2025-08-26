package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386376 allocated for Yifan Xie.
 * @author Sean A. Irvine
 */
public class A386376 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z b = Z.valueOf(++mN);
    long k = 1;
    while (!Predicates.SQUARE_FREE.is(b)) {
      b = b.add(Functions.RAD.z(b));
      ++k;
    }
    return Z.valueOf(k);
  }
}

