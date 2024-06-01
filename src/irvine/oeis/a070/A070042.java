package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070042 At these values of n the first, 2nd, 3rd, 4th and 5th cyclotomic polynomials all give prime numbers.
 * @author Sean A. Irvine
 */
public class A070042 extends FilterSequence {

  /** Construct the sequence. */
  public A070042() {
    super(1, new A070025(), k -> k.add(1).multiply(k).add(1).multiply(k).add(1).multiply(k).add(1).isProbablePrime());
  }
}
