package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A079594 Primes p such that floor(p^Pi) is prime.
 * @author Sean A. Irvine
 */
public class A079594 extends FilterSequence {

  /** Construct the sequence. */
  public A079594() {
    super(1, new A000040(), p -> CR.valueOf(p).pow(CR.PI).floor().isProbablePrime());
  }
}
