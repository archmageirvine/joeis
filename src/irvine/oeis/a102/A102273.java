package irvine.oeis.a102;
// manually pricongr at 2022-01-01 20:45

import irvine.oeis.prime.CongruenceForm;

/**
 * A102273 Primes p such that Q(sqrt(-21p)) has genus characters chi_{-3} = -1, chi_{-7} = +1.
 * @author Georg Fischer
 */
public class A102273 extends CongruenceForm {

  /** Construct the sequence. */
  public A102273() {
    super(84, 0, 2, 11, 23, 71);
    next(); // skip over 2
  }
}
