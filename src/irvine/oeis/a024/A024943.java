package irvine.oeis.a024;

import irvine.oeis.Sequence;
import irvine.oeis.a002.A002476;

/**
 * A024943 Number of partitions of n into distinct 6k+1 primes.
 * @author Sean A. Irvine
 */
public class A024943 extends A024941 {

  /** Construct the sequence. */
  public A024943() {
    super(1);
  }

  @Override
  protected Sequence seq() {
    return new A002476();
  }

  {
    next();
  }
}
