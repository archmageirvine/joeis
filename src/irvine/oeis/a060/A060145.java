package irvine.oeis.a060;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A060145 a(n) = floor(n/tau) - floor(n/(1 + tau)).
 * @author Georg Fischer
 */
public class A060145 extends FloorSequence {

  /** Construct the sequence. */
  public A060145() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(n).divide(CR.PHI).floor()
         .subtract(CR.valueOf(n).divide(CR.ONE.add(CR.PHI)).floor());
  }

}
