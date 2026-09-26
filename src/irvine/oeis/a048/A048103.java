package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectPredicate;
import irvine.oeis.Sequence1;

/**
 * A048103 Numbers not divisible by p^p for any prime p.
 * @author Sean A. Irvine
 */
public class A048103 extends Sequence1 implements DirectPredicate {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }

  @Override
  public boolean is(final Z n) {
    // Perform a direct check rather than factoring n
    for (Z p = Z.TWO, q; (q = p.pow(p)).compareTo(n) <= 0; p = Functions.NEXT_PRIME.z(p)) {
      if (n.mod(q).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean is(final long n) {
    return is(Z.valueOf(n));
  }

}
