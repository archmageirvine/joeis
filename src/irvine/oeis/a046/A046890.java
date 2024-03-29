package irvine.oeis.a046;

import irvine.oeis.InverseSequence;

/**
 * A046890 a(n) is the least integer that has exactly n anagrams that are primes.
 * @author Sean A. Irvine
 */
public class A046890 extends InverseSequence {

  /** Construct the sequence. */
  public A046890() {
    super(0, new A046810(), 0);
  }
}
