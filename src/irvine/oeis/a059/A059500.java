package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a053.A053176;

/**
 * A059500 Primes p such that both q=(p-1)/2 and 2p + 1 = 4q + 3 are composite numbers. Intersection of A059456 and A053176.
 * @author Sean A. Irvine
 */
public class A059500 extends IntersectionSequence {

  /** Construct the sequence. */
  public A059500() {
    super(new A059456(), new A053176());
  }
}
