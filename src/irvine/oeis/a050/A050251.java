package irvine.oeis.a050;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a016.A016115;

/**
 * A050251 Number of palindromic primes less than 10^n.
 * @author Sean A. Irvine
 */
public class A050251 extends PartialSumSequence {

  /** Construct the sequence. */
  public A050251() {
    super(new A016115());
  }
}
