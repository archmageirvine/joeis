package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a022.A022843;

/**
 * A062268 Numbers k such that floor(k*e) is a square.
 * @author Sean A. Irvine
 */
public class A062268 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062268() {
    super(0, 0, new A022843(), Z::isSquare);
  }
}
