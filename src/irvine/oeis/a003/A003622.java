package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.cons.BeattySequence;

/**
 * A003622 The Wythoff compound sequence AA: a(n) = floor(n*phi^2) - 1, where phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A003622 extends BeattySequence implements DirectSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A003622() {
    super(1, CR.PHI.multiply(CR.PHI));
  }

  @Override
  public Z a(final Z n) {
    return super.a(n).subtract(1);
  }

  @Override
  public Z a(final int n) {
    return super.a(n).subtract(1);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
