package irvine.oeis.a181;
// manually partsumm/partsum at 2022-03-24 22:56

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006125;

/**
 * A181388 a(n) = Sum_{k=1..n} 2^T(k-1), where T = A000217 are the triangular numbers 0, 1, 3, 6, 10, ... . For n=0 we have the empty sum equal to 0.
 * @author Georg Fischer
 */
public class A181388 extends PartialSumSequence {

  /** Construct the sequence. */
  public A181388() {
    super(new PrependSequence(1, new A006125(), 0));
  }
}
