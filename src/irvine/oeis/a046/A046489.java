package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002113;

/**
 * A046489 Sum of the first n palindromes (A002113).
 * @author Sean A. Irvine
 */
public class A046489 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046489() {
    super(new A002113().skip(1));
  }
}
