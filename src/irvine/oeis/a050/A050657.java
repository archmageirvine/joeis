package irvine.oeis.a050;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a048.A048853;

/**
 * A050657 Numbers n such that number of primes produced according to rules stipulated in Honaker's A048853 is 6.
 * @author Sean A. Irvine
 */
public class A050657 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A050657() {
    super(1, new A048853(), 6);
  }
}
