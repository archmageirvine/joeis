package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062366 Let f be a function on rationals p/q (p,q coprime) defined by f(p/q) = abs(p-q)/nextoddColl(p) (so the denominator is the next odd number in the Collatz trajectory of p). Start with f(n/1) and repeat application of f until it reaches again an integer, which is a(n). If no integer is reached, then a(n)=0.
 * @author Sean A. Irvine
 */
public class A062366 extends Sequence1 {

  private long mN = 0;

  private Z collatzOdd(final Z n) {
    return n.isEven() ? n.makeOdd() : n.multiply(3).add(1).makeOdd();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Q t = new Q(mN);
    do {
      t = new Q(t.num().subtract(t.den()).abs(), collatzOdd(t.num()));
    } while (!t.isInteger());
    return t.toZ();
  }
}
