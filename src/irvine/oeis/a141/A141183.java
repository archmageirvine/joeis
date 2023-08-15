package irvine.oeis.a141;
// manually pricongrm/pricongr at 2023-08-13 15:10

import irvine.oeis.prime.CongruenceForm;

/**
 * A141183 Primes of the form -x^2+6*x*y+2*y^2 (as well as of the form 7*x^2+10*x*y+2*y^2).
 * @author Georg Fischer
 */
public class A141183 extends CongruenceForm {

  /** Construct the sequence. */
  public A141183() {
    super(44, 0, 2, 7, 11, 19, 35, 39, 43);
  }
}
