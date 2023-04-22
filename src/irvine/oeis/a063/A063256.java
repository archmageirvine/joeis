package irvine.oeis.a063;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063256 Let f be a function on rationals p/q (p,q coprime) defined by f(p/q) = abs(p-q)/g(p), where g(p) is the next odd number (starting with p) that we get after iteration of h(n) = n/2 when n is even, 3n-1 when n is odd. Start with f(n/1) and iterate f until it reaches again an integer, which is a(n). If no integer is reached, then a(n)=0.
 * @author Sean A. Irvine
 */
public class A063256 extends Sequence1 {

  private long mN = 0;

  protected Z h(final Z n) {
    return n.isEven() ? n.makeOdd() : n.multiply(3).subtract(1).makeOdd();
  }

  private Q f(final Q n) {
    return new Q(n.num().subtract(n.den()).abs(), h(n.num()));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Q f = new Q(mN);
    do {
      f = f(f);
    } while (!f.isInteger());
    return f.toZ();
  }
}
