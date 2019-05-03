package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100366 <code>a(n)</code> is the least prime number q such that <code>q,q+1,q+2,q+3,...,q+n-1</code> have <code>2,4,8,...,2^n</code> divisors respectively.
 * @author Georg Fischer
 */
public class A100366 extends FiniteSequence {

  /** Construct the sequence. */
  public A100366() {
    super(2, 5, 193, 613, 1124581, 52071301, 213536830501L);
  }
}
