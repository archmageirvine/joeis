package irvine.oeis.a277;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001045;

/**
 * A277356 Jacobsthal numbers which are semiprimes.
 * @author Sean A. Irvine
 */
public class A277356 extends FilterSequence {

  /** Construct the sequence. */
  public A277356() {
    super(1, new A001045(), SEMIPRIME);
  }
}
