package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025055 Positions of odd numbers in sequence A025051 (numbers of form j*k + k*i + i*j, without repetitions, where 1 &lt;= i &lt;= j &lt;= k).
 * @author Sean A. Irvine
 */
public class A025055 extends A025051 {

  private long mN = 0;

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
