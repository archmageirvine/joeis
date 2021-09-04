package irvine.oeis.a182;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A182079 a(n) = floor(n*floor((n-1)/2)/3).
 * @author Georg Fischer
 */
public class A182079 extends FloorSequence {
  /** Construct the sequence. */
  public A182079() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(CR.valueOf(mN - 1).divide(CR.TWO).floor().multiply(n)).divide(CR.THREE).floor();
  }

}
