package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025056 <code>a(n) =</code> position of <code>3*n^2</code> in sequence <code>A025051</code> (numbers of form <code>j*k + k*i + i*j</code>, without repetitions, where <code>1 &lt;= i &lt;= j &lt;= k)</code>.
 * @author Sean A. Irvine
 */
public class A025056 extends A025051 {

  private long mN = 0;
  private long mM = 2;

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
