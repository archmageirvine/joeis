package irvine.oeis.a213;

import irvine.oeis.FiniteSequence;

/**
 * A213175 Primes p such that subtracting two from any single decimal digit of p produces another prime with restriction that first digit may not be changed to a <code>0</code> (obviously p cannot contain digits less than <code>2)</code>.
 * @author Georg Fischer
 */
public class A213175 extends FiniteSequence {

  /** Construct the sequence. */
  public A213175() {
    super(5, 7, 43, 73, 463, 859, 883, 3559, 3823, 4273, 77269);
  }
}
