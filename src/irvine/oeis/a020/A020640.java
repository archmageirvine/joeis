package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.a003.A003285;

/**
 * A020640 Increasing periods of continued fraction for <code>sqrt(n) (period</code> of continued fraction for <code>sqrt(A013645(n)))</code>.
 * @author Sean A. Irvine
 */
public class A020640 extends RecordSequence {

  /** Construct the sequence. */
  public A020640() {
    super(new A003285(), Z.ZERO);
  }
}
