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
  protected LattEnum getEnum() {
    return new LattEnum.LattEnumLabelledCount(Lattice.init2(), mN, 3, new Globals());
  }

  /**
   * Run this sequence for the specified value of <code>n</code>.
   * @param args value to run
   */
  public static void main(final String... args) {
    final int n = Integer.parseInt(args[0]);
    final A055512 seq = new A055512();
    seq.mN = n - 1;
    System.out.println(seq.next());
  }
}
