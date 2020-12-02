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
