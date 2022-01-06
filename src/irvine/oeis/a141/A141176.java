package irvine.oeis.a141;
// manually pricongr at 2022-01-02 18:42

import irvine.oeis.PrependSequence;
import irvine.oeis.prime.CongruenceForm;

/**
 * A141176 Primes of the form 2*x^2 + 3*x*y - 3*y^2 (as well as of the form 6*x^2 + 9*x*y + 2*y^2).
 * @author Georg Fischer
 */
public class A141176 extends PrependSequence {

  /** Construct the sequence. */
  public A141176() {
    super(2, new CongruenceForm(33, 1, 11, 2, 8, 17, 29, 32), 2, 11);
  }
}
