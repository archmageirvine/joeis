package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014884 n is equal to the number of 1's in all numbers <code>&lt;= n</code> written in base 9.
 * @author Sean A. Irvine
 */
public class A014884 implements Sequence {

  private long mC = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 9 == 1) {
          ++mC;
        }
        m /= 9;
      }
      if (mC == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
