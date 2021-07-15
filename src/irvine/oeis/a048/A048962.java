package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a036.A036275;

/**
 * A048962 Table in which n-th row lists digits in periodic part of decimal expansion of 1/n.
 * @author Sean A. Irvine
 */
public class A048962 extends A036275 {

  private int[] mA = super.step();
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      mA = super.step();
      mM = 0;
    }
    return Z.valueOf(mA[mM]);
  }
}
