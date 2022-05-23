package irvine.oeis.a046;

import irvine.oeis.InverseSequence;
import irvine.oeis.a039.A039999;

/**
 * A046893 a(n) has exactly n permutations of digits that are primes.
 * @author Sean A. Irvine
 */
public class A046893 extends InverseSequence {

  /** Construct the sequence. */
  public A046893() {
    super(new A039999(), 0);
  }
}
