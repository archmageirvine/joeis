package irvine.oeis.a067;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A067775 Primes p such that p + 4 is composite.
 * @author Sean A. Irvine
 */
public class A067775 extends FilterSequence {

  /** Construct the sequence. */
  public A067775() {
    super(1, new A000040(), p -> !p.add(4).isProbablePrime());
  }
}
