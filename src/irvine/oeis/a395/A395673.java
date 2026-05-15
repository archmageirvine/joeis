package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A395673 The first (2*n-1)-digit palindromic prime occurring in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A395673 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z mod = Z.TEN.pow(2L * ++mN - 1);
    Z v = Z.ZERO;
    final Sequence pi = new A000796();
    for (int k = 1; k < 2 * mN; ++k) {
      v = v.multiply(10).add(pi.next());
    }
    while (true) {
      if (Predicates.PALINDROME.is(v) && v.isProbablePrime()) {
        return v;
      }
      v = v.multiply(10).mod(mod).add(pi.next());
    }
  }
}
