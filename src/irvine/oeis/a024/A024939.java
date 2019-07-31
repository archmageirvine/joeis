package irvine.oeis.a024;

import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;

/**
 * A024939 Number of partitions of n into distinct odd primes.
 * @author Sean A. Irvine
 */
public class A024939 extends A024941 {

  @Override
  protected Sequence seq() {
    return new SkipSequence(new A000040(), 1);
  }
}
