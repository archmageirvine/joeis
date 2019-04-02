package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Stirling2TransformSequence;
import irvine.oeis.a000.A000311;

/**
 * A005805 Number of phylogenetic trees with n labels.
 * @author Sean A. Irvine
 */
public class A005805 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A005805() {
    // We need to shove an extra "1" into A000311
    super(new A000311() {
      private boolean mFirst = true;
      @Override
      public Z next() {
        if (mFirst) {
          mFirst = false;
          return Z.ZERO;
        }
        return Z.ONE.max(super.next());
      }
    }, 0);
    next();
  }
}
