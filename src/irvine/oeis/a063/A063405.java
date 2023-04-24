package irvine.oeis.a063;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063405 T(n,m) for positive n,m is the first integer we get when iterating f starting with f(n/m), where function f on rationals is defined as f(p/q)=abs(p-q)/NextOddCollatz(p)(we assume p,q coprime), where NextOddCollatz(p) is the next odd number that is found in the Collatz trajectory of p. When no integer is reached by iteration, T(n,m)=0.
 * @author Sean A. Irvine
 */
public class A063405 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z collatzOdd(final Z n) {
    return n.isEven() ? n.makeOdd() : n.multiply(3).add(1).makeOdd();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    if (mN == mM) {
      return Z.ZERO;
    }
    Q t = new Q(mN, mM);
    do {
      t = new Q(t.num().subtract(t.den()).abs(), collatzOdd(t.num()));
    } while (!t.isInteger());
    return t.toZ();
  }
}
