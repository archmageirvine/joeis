package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A065348 Positions of zeros in A065345.
 * @author Sean A. Irvine
 */
public class A065348 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065348() {
    super(1, new A065345(), Z::isZero);
  }
}
