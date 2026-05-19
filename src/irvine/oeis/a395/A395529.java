package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a055.A055932;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A395529 Numbers k such that k cannot be written as m + t where m*t belongs to A055932.
 * @author Sean A. Irvine
 */
public class A395529 extends Sequence1 {

  private long mN = 0;
  private final DirectSequence mA = DirectSequence.create(new SimpleTransformSequence(new A055932(), k -> k.shiftLeft(2)));

  private boolean is(final long n) {
    if (n == 2 || n == 4) {
      return false;
    }
    final Z n2 = Z.valueOf(n).square();
    long k = -1;
    Z t;
    while ((t = n2.subtract(mA.a(++k))).signum() > 0) {
      if (Predicates.SQUARE.is(t)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
