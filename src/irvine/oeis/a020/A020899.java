package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a007.A007895;

/**
 * A020899 Numbers k with an odd number of terms in their Zeckendorf representation (write k as a sum of non-consecutive distinct Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A020899 extends A007895 {

  private long mN = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
