package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A087254 Numbers k, divisible by 4, such that k is the only number for which k is the maximum value in any Collatz trajectory.
 * @author Sean A. Irvine
 */
public class A087254 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A087254() {
    super(1, 1, new A087253(), ONE);
  }

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}

