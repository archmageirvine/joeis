package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086762 A piecewise recurrence relation with a(2)=7 and for n&gt;=2: if a(n) is prime, not 31, a(n+1) = A000265(3*a(n)+1); if a(n) is odd composite, not 1, a(n+1) = A000265(a(n)+1); if a(n) is even, a(n+1) = A000265(a(n)); if a(n) is 1 or 31, find the number S(n) of occurrences of 1 and 31 among a(2),a(3),...,a(n) and compute a(n+1) by the above rules as if a(n) were 2+S(n), unless 2+S(n)=31, in which case a(n+1)=47.
 * @author Sean A. Irvine
 */
public class A086762 extends Sequence2 {

  private long mX = 2;
  private Z mN = Z.TWO;

  @Override
  public Z next() {
    if (mN.isOne() || mN.equals(31)) {
      mN = Z.valueOf(++mX);
    }
    if (Predicates.PRIME.is(mN)) {
      mN = mN.multiply(3).add(1);
    } else if (mN.isOdd()) {
      mN = mN.add(1);
    }
    mN = mN.makeOdd();
    return mN;
  }
}
