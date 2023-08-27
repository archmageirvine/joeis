package irvine.oeis.a141;
// manually 2023-08-25

import irvine.oeis.prime.CongruenceForm;

/**
 * A141899 Primes of the form 2*3*5*7*k + 97.
 * @author Georg Fischer
 */
public class A141899 extends CongruenceForm {

  /** Construct the sequence. */
  public A141899() {
    super(210, 0, 97);
  }
}

