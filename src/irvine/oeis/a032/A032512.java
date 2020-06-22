package irvine.oeis.a032;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a255.A255270;

/**
 * A032512 Sum of the integer part of 4th roots of integers <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A032512 extends PartialSumSequence {

  /** Construct the sequence. */
  public A032512() {
    super(new A255270());
  }
}
