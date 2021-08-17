package irvine.oeis.a050;

import irvine.oeis.PositionSequence;
import irvine.oeis.a048.A048853;

/**
 * A050659 Numbers n such that number of primes produced according to rules stipulated in Honaker's A048853 is 8.
 * @author Sean A. Irvine
 */
public class A050659 extends PositionSequence {

  /** Construct the sequence. */
  public A050659() {
    super(1, new A048853(), 8);
  }
}
