package irvine.oeis.a014;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a001.A001223;

/**
 * A014320 The next new gap between successive primes.
 * @author Sean A. Irvine
 */
public class A014320 extends DistinctSequence {

  /** Construct the sequence. */
  public A014320() {
    super(1, new A001223());
  }
}
