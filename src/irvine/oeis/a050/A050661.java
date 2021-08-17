package irvine.oeis.a050;

import irvine.oeis.PositionSequence;
import irvine.oeis.a048.A048853;

/**
 * A050661 Numbers n such that number of primes produced according to rules stipulated in Honaker's A048853 is 10.
 * @author Sean A. Irvine
 */
public class A050661 extends PositionSequence {

  /** Construct the sequence. */
  public A050661() {
    super(1, new A048853(), 10);
  }
}
