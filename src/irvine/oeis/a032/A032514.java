package irvine.oeis.a032;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a100.A100196;

/**
 * A032514 Sum of the integer part of <code>3/2-th</code> roots of integers less than <code>n</code>.
 * @author Sean A. Irvine
 */
public class A032514 extends PartialSumSequence {

  /** Construct the sequence. */
  public A032514() {
    super(new PrependSequence(new A100196(), 0));
  }
}
