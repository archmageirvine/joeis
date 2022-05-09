package irvine.oeis.a242;

import irvine.math.z.Z;

/**
 * A242785 Number of permutations of [n] avoiding the consecutive step pattern given by the binary expansion of n, where 1=up and 0=down.
 * @author Georg Fischer
 */
public class A242785 extends A242784 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, mN);
  }
}
