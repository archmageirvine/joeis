package irvine.oeis.a050;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a048.A048853;

/**
 * A050658 Numbers n such that number of primes produced according to rules stipulated in Honaker's A048853 is 7.
 * @author Sean A. Irvine
 */
public class A050658 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A050658() {
    super(1, new A048853(), 7);
  }
}
