package irvine.oeis.a055;

import gebhardt.LattEnum;
import irvine.oeis.a006.A006966;

/**
 * A055512.
 * @author Sean A. Irvine
 */
public class A055512 extends A006966 {

  @Override
  protected LattEnum getEnum() {
    return new LattEnum.LattEnumLabelledCount(mLattice, mN, 3, mGlobals);
  }
}
