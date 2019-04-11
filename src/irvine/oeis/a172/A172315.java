package irvine.oeis.a172;

import irvine.oeis.FiniteSequence;

/**
 * A172315 Primes of the form 2^i*3^j <code>- 1</code> with i + j <code>= 13</code>.
 * @author Georg Fischer
 */
public class A172315 extends FiniteSequence {

  /** Construct the sequence. */
  public A172315() {
    super(8191, 27647, 62207, 139967, 314927, 472391, 1062881);
  }
}
