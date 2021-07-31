package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034878 Numbers k such that k! can be written as the product of smaller factorials.
 * @author Sean A. Irvine
 */
public class A034878 extends A034876 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!super.next().isZero() || mN == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
