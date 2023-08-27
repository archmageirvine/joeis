package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A065296 Values of n such that A065295(n) = 1.
 * @author Sean A. Irvine
 */
public class A065296 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065296() {
    super(1, new A065295(), Z.ONE::equals);
  }
}
