package irvine.oeis.a046;

import irvine.oeis.InverseSequence;

/**
 * A046890 a(n) has exactly n anagrams that are primes.
 * @author Sean A. Irvine
 */
public class A046890 extends InverseSequence {

  /** Construct the sequence. */
  public A046890() {
    super(new A046810(), 0);
  }
}
