package irvine.oeis.a055;

import gebhardt.Globals;
import gebhardt.LattEnum;
import gebhardt.Lattice;
import irvine.oeis.a006.A006966;

/**
 * A055512 Lattices with n labeled elements.
 * @author Sean A. Irvine
 */
public class A055512 extends A006966 {

  @Override
  protected LattEnum getEnum(final Lattice lattice, final int minSize) {
    return new LattEnum.LattEnumLabelledCount(lattice, mN, minSize, new Globals());
  }

  // For a main, see A006966
}
