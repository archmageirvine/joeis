package irvine.oeis.a024;

import irvine.oeis.Sequence;
import irvine.oeis.a002.A002476;

/**
 * A024943 Number of partitions of n into distinct <code>6k+1</code> primes.
 * @author Sean A. Irvine
 */
public class A024943 extends A024941 {

  @Override
  protected Sequence seq() {
    return new A002476();
  }

  {
    next();
  }
}
