package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A050411 Analog of 3x+1 function.
 * @author Sean A. Irvine
 */
public class A050411 extends A000201 {

  private static final CR PHI2 = CR.PHI.multiply(CR.PHI);
  private long mN = 0;
  private long mM = super.next().longValueExact();

  @Override
  public Z next() {
    if (++mN == mM) {
      mM = super.next().longValueExact();
      return PHI2.multiply(CR.valueOf(mN).divide(CR.PHI).ceil()).ceil().add(1);
    } else {
      return CR.valueOf(mN).divide(PHI2).ceil();
    }
  }
}
