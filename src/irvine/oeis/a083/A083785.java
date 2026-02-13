package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a034.A034173;

/**
 * A083785 Triangle read by rows in which the n-th row gives the smallest set of n consecutive numbers with the same prime signatures.
 * @author Sean A. Irvine
 */
public class A083785 extends A034173 {

  private long mN = 1;
  private long mM = -1;
  private Z mA = super.next();

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mA = super.next();
    }
    return mA.add(mM);
  }
}
