package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085926 a(n) = n if n is composite, else a(n) = smallest composite number beginning with n not obtained trivially by simply placing a zero as a least significant digit; i.e., a(n) is not equal to 10n.
 * @author Sean A. Irvine
 */
public class A085926 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(12);
    }
    if (!Predicates.PRIME.is(mN)) {
      return Z.valueOf(mN);
    }
    long t = mN * 10;
    while (Predicates.PRIME.is(++t)) {
      // do nothing
    }
    return Z.valueOf(t);
  }
}
