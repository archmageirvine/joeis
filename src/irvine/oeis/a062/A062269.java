package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.Sequence;

/**
 * A062269 Numbers k such that floor(gamma * k) is a square, where gamma is the Euler-Mascheroni constant (A001620).
 * @author Sean A. Irvine
 */
public class A062269 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062269() {
    super(0, 0, new Sequence() {

      private long mN = -1;

      @Override
      public Z next() {
        return CR.GAMMA.multiply(++mN).floor();
      }
    }, Z::isSquare);
  }
}
