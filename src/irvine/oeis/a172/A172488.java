package irvine.oeis.a172;

import irvine.oeis.FiniteSequence;

/**
 * A172488 Primes of the form 2^i * 3^j + 1 with i + j = 13.
 * @author Georg Fischer
 */
public class A172488 extends FiniteSequence {

  /** Construct the sequence. */
  public A172488() {
    super(12289, 18433, 139969, 209953, 472393);
  }
}
