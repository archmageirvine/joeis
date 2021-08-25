package irvine.oeis.a051;

import irvine.oeis.PrimePositionSubsequence;
import irvine.oeis.a000.A000110;

/**
 * A051130 Indices of prime Bell numbers A000110.
 * @author Sean A. Irvine
 */
public class A051130 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A051130() {
    super(new A000110(), 0);
  }
}
