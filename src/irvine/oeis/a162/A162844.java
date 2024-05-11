package irvine.oeis.a162;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A162844 Let b(n) be the n-th positive integer that is a palindrome in base 2. Then a(n) = A162843(n)/b(n).
 * @author Sean A. Irvine
 */
public class A162844 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Predicates.PALINDROME.is(2, ++mN)) {
      // do nothing
    }
    final Z v = Z.valueOf(mN);
    Z q = v;
    int c = 1;
    do {
      q = q.add(v);
      ++c;
    } while (!Predicates.PALINDROME.is(2, q));
    return Z.valueOf(c);
  }
}
