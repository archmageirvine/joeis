package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.a309.A309148;

/**
 * A308667 (1/n) times the number of n-member subsets of [n^2] whose elements sum to a multiple of n.
 * @author Georg Fischer
 */
public class A308667 extends A309148 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, mN);
  }
}
