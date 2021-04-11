package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002385;

/**
 * A046485 Sum of first n palindromic primes A002385.
 * @author Sean A. Irvine
 */
public class A046485 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046485() {
    super(new A002385());
  }
}
