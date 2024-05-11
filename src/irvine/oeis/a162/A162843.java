package irvine.oeis.a162;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A162843 Let b(n) be the n-th positive integer that is a palindrome in base 2. a(n) = the smallest multiple of b(n) that is &gt; b(n) and that is also a palindrome in binary.
 * @author Sean A. Irvine
 */
public class A162843 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Predicates.PALINDROME.is(2, ++mN)) {
      // do nothing
    }
    final Z v = Z.valueOf(mN);
    Z q = v;
    do {
      q = q.add(v);
    } while (!Predicates.PALINDROME.is(2, q));
    return q;
  }
}
