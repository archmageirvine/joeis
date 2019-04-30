package irvine.oeis.a086;

import irvine.oeis.FiniteSequence;

/**
 * A086208 Prime numbers p with the property that the sequence p-1*2, p-2*3, p-3*4, p-4*5, <code>..</code>., consists only of primes and a final 1.
 * @author Georg Fischer
 */
public class A086208 extends FiniteSequence {

  /** Construct the sequence. */
  public A086208() {
    super(3, 7, 13, 43, 73);
  }
}
