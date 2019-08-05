package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025063 Positions of odd numbers in <code>A025060</code> (numbers of form <code>j*k + k*i + i*j</code>, where <code>1 &lt;= i &lt; j &lt; k)</code>.
 * @author Sean A. Irvine
 */
public class A025063 extends A025060 {

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
