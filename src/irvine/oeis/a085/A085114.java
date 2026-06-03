package irvine.oeis.a085;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085114 Binary expansion of Sum 1/(p*2^p) where p runs through the set of Artin primes (primes with primitive root 2).
 * @author Sean A. Irvine
 */
public class A085114 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085114() {
    super(0, new A085108().getCR(), 2);
  }
}

