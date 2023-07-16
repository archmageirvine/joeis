package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000720;

/**
 * A064517 Numbers k such that pi(k) is a square.
 * @author Sean A. Irvine
 */
public class A064517 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064517() {
    super(1, new A000720(), Z::isSquare);
  }
}
