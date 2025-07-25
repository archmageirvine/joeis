package irvine.oeis.a234;
// Generated by gen_seq4.pl insect/insect2p at 2022-02-24 19:57

import irvine.oeis.IntersectionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005382;
import irvine.oeis.a027.A027699;

/**
 * A234999 Primes p such that the p-th evil number is prime; 2 together with evil primes p such that 2p - 1 is prime.
 * @author Georg Fischer
 */
public class A234999 extends PrependSequence {

  /** Construct the sequence. */
  public A234999() {
    super(1, new IntersectionSequence(new A005382(), new A027699()), 2);
  }
}
