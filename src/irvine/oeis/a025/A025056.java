package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025056 a(n) = position of 3*n^2 in sequence A025051 (numbers of form j*k + k*i + i*j, without repetitions, where 1 &lt;= i &lt;= j &lt;= k).
 * @author Sean A. Irvine
 */
public class A025056 extends A025051 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).square().multiply(3);
    while (true) {
      ++mN;
      if (super.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
