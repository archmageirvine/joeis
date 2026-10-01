package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086763 Count of complete evaluations of each mapping in the trajectory of n in the mapping n-&gt; n*3+1 if n is prime, n+1 if n is odd composite, n/2 while n even.
 * @author Sean A. Irvine
 */
public class A086763 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 31) {
      return Z.valueOf(15);
    }
    Z m = Z.valueOf(mN);
    long c = 0;
    while (!m.isOne() && !m.equals(31)) {
      if (Predicates.PRIME.is(m)) {
        m = m.multiply(3).add(1);
        ++c;
      } else if (m.isOdd()) {
        m = m.add(1);
        ++c;
      }
      m = m.makeOdd();
      c += m.auxiliary();
    }
    return Z.valueOf(c);
  }
}
