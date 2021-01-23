package irvine.oeis.a032;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a178.A178487;

/**
 * A032513 Sum of the integer part of 5th roots of positive integers less than or equal to n.
 * @author Sean A. Irvine
 */
public class A032513 extends PartialSumSequence {

  /** Construct the sequence. */
  public A032513() {
    super(new A178487());
  }
}
