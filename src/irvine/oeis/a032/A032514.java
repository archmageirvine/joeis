package irvine.oeis.a032;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a100.A100196;

/**
 * A032514 Sum of the integer part of 3/2-th roots of integers less than n.
 * @author Sean A. Irvine
 */
public class A032514 extends PartialSumSequence {

  /** Construct the sequence. */
  public A032514() {
    super(new A100196());
  }
}
