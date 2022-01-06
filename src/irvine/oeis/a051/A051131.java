package irvine.oeis.a051;

import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.a000.A000110;

/**
 * A051131 Prime Bell numbers (A000110).
 * @author Sean A. Irvine
 */
public class A051131 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A051131() {
    super(new A000110());
  }
}
