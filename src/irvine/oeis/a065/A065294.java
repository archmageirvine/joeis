package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A065294 Values of k such that A065293(k) = 0.
 * @author Sean A. Irvine
 */
public class A065294 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065294() {
    super(1, new A065293(), Z::isZero);
  }
}
