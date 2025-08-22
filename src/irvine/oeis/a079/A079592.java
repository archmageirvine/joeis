package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A079592 Primes for which floor(Pi*x) is prime.
 * @author Sean A. Irvine
 */
public class A079592 extends FilterSequence {

  /** Construct the sequence. */
  public A079592() {
    super(1, new A000040(), p -> CR.PI.multiply(p).floor().isProbablePrime());
  }
}
