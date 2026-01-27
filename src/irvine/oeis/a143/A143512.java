package irvine.oeis.a143;

import irvine.oeis.FiniteSequence;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A143512 Numbers of the form 3^a * 5^b * 17^c * 257^d * 65537^e; products of Fermat primes.
 * @author Sean A. Irvine
 */
public class A143512 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A143512() {
    // Uses own form of A019434 to prevent search for a term larger than 65537
    super(1, new FiniteSequence(1, FiniteSequence.FINITE, 3, 5, 17, 257, 65537));
  }
}
