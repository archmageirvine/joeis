package irvine.oeis.a024;

import irvine.oeis.Sequence;
import irvine.oeis.a002.A002145;

/**
 * A024942 Number of partitions of n into distinct primes of the form 4k + 3.
 * @author Sean A. Irvine
 */
public class A024942 extends A024941 {

  @Override
  protected Sequence seq() {
    return new A002145();
  }
}
