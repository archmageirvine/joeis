package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025054 Positions of even numbers in sequence A025051 (numbers of form j*k + k*i + i*j, without repetitions, where 1 &lt;= i &lt;= j &lt;= k).
 * @author Sean A. Irvine
 */
public class A025054 extends A025051 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
