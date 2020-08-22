package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025057 Position of 3n+2 in A025051 (numbers of form j*k + k*i + i*j, without repetitions, where 1 &lt;= i &lt;= j &lt;= k).
 * @author Sean A. Irvine
 */
public class A025057 extends A025051 {

  private long mN = 0;
  private Z mM = Z.TWO;

  @Override
  public Z next() {
    mM = mM.add(3);
    while (true) {
      ++mN;
      if (super.next().equals(mM)) {
        return Z.valueOf(mN);
      }
    }
  }
}
