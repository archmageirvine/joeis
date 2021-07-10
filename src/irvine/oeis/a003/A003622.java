package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.BeattySequence;

/**
 * A003622 The Wythoff compound sequence AA: [n*phi^2] - 1, where phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A003622 extends BeattySequence {

  /** Construct the sequence */
  public A003622() {
    super(1, CR.PHI.multiply(CR.PHI));
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
