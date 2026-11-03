package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A087254 If we start the Collatz-iteration at these values, each divisible by 4, all subsequent terms in trajectory are smaller than the initial value.
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

