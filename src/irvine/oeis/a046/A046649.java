package irvine.oeis.a046;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046649 a(n) is the number of nonseparable planar maps with 2*n+1 edges and a fixed outer face of 4 edges which are invariant under a rotation of a 1/2 turn. (Column 2 of A091665.).
 * @author Sean A. Irvine
 */
public class A046649 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(3 * mN - 5).multiply(7 * mN - 11).multiply(4)
      .divide(mF.factorial(2 * mN - 1)).divide(mF.factorial(mN - 2));
  }
}
