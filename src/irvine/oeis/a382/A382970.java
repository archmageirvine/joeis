package irvine.oeis.a382;

import irvine.oeis.prime.PrimeConditionListSequence;

/**
 * A382970 Numbers k such that {k, k+2, k+6, k+8, k+90, k+92, k+96, k+98} are all prime.
 * @author Sean A. Irvine
 */
public class A382970 extends PrimeConditionListSequence {

  /** Construct the sequence */
  public A382970() {
    super(1, 1, 0, 1, 2, 1, 6, 1, 8, 1, 90, 1, 92, 1, 96, 1, 98);
  }
}
