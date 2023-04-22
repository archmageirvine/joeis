package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063257 Let f be a function on rationals p/q (p,q coprime) defined by f(p/q) = abs(p-q)/g(p), where g(p) is the next odd number (starting with p) that we get after iteration of h(n) = n/2 when n is even, 5n+1 when n is odd. Start with f(n/1) and iterate f until it reaches again an integer, which is a(n). If no integer is reached, then a(n)=0.
 * @author Sean A. Irvine
 */
public class A063257 extends A063256 {

  @Override
  protected Z h(final Z n) {
    return n.isEven() ? n.makeOdd() : n.multiply(5).add(1).makeOdd();
  }
}
