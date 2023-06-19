package irvine.oeis.a141;
// manually pricongr at 2022-01-02 18:42

import irvine.oeis.PrependSequence;
import irvine.oeis.prime.CongruenceForm;

/**
 * A141173 Primes of the form -2*x^2+2*x*y+3*y^2 (as well as of the form 6*x^2+10*x*y+3*y^2).
 * @author Georg Fischer
 */
public class A141173 extends PrependSequence {

  /** Construct the sequence. */
  public A141173() {
    super(new CongruenceForm(28,  1,  7,  3,  19,  27).skip(2), 3,  7);
  }
}
