package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A065349 Positions of zeros in A065346.
 * @author Sean A. Irvine
 */
public class A065349 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065349() {
    super(1, new A065346(), Z::isZero);
  }
}
