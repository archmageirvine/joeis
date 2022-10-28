package irvine.oeis.a050;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a048.A048853;

/**
 * A050655 Numbers n such that number of primes produced according to rules stipulated in Honaker's A048853 is 4.
 * @author Sean A. Irvine
 */
public class A050655 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A050655() {
    super(1, new A048853(), 4);
  }
}
