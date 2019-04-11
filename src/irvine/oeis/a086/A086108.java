package irvine.oeis.a086;

import irvine.oeis.FiniteSequence;

/**
 * A086108 Numbers n with the following property: Every symmetric polynomial of the digits of n is prime. (A symmetric polynomial is unchanged by any permutation of its variables, so the symmetric polynomials of <code>{a</code>,b,c} would be a+b+c,ab+bc+ac and abc.).
 * @author Georg Fischer
 */
public class A086108 extends FiniteSequence {

  /** Construct the sequence. */
  public A086108() {
    super(2, 3, 5, 7, 12, 21, 113, 115, 131, 151, 311, 511);
  }
}
