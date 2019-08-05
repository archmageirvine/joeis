package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025055 Positions of odd numbers in sequence <code>A025051</code> (numbers of form <code>j*k + k*i + i*j</code>, without repetitions, where <code>1 &lt;= i &lt;= j &lt;= k)</code>.
 * @author Sean A. Irvine
 */
public class A025055 extends A025051 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
