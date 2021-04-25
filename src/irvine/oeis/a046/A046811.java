package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;

/**
 * A046811 Numbers (with nonzero digits) where A046810 increases.
 * @author Sean A. Irvine
 */
public class A046811 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A046811() {
    super(new A046810() {
      @Override
      public Z next() {
        // Contortions to deal with excluding indices containing 0
        final Z t = super.next();
        return String.valueOf(mN).contains("0") ? Z.ZERO : t;
      }
    }, 1);
  }
}
