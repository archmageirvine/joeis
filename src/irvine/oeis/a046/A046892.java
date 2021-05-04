package irvine.oeis.a046;

import irvine.oeis.RecordSequence;
import irvine.oeis.a039.A039999;

/**
 * A046892 Number of permutations of digits of A046891(n) that are primes.
 * @author Sean A. Irvine
 */
public class A046892 extends RecordSequence {

  /** Construct the sequence. */
  public A046892() {
    super(new A039999());
  }
}
