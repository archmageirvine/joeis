package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178447 <code>a(n) =</code> number of 4-digit primes with digit sum <code>n,</code> where n runs through the non-multiples of 3 in the range <code>[2..34]</code>.
 * @author Georg Fischer
 */
public class A178447 extends FiniteSequence {

  /** Construct the sequence. */
  public A178447() {
    super(0, 4, 8, 20, 19, 31, 52, 67, 77, 93, 101, 116, 95, 92, 91, 63, 51, 29, 30, 16, 5, 0, 1);
  }
}
