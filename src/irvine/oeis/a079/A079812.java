package irvine.oeis.a079;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001359;

/**
 * A079812 Lower of twin primes (p,p+2) such that (p*(p+2))^2 + p^2 - (p+2)^2 and (p*(p+2))^2 - p^2 + (p+2)^2 are both prime.
 * @author Sean A. Irvine
 */
public class A079812 extends FilterSequence {

  /** Construct the sequence. */
  public A079812() {
    super(new A001359(), p -> p.multiply(p.add(2)).square().add(p.square()).subtract(p.add(2).square()).isProbablePrime()
      && p.multiply(p.add(2)).square().subtract(p.square()).add(p.add(2).square()).isProbablePrime());
  }
}

