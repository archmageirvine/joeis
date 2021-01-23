package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025062 Positions of even numbers in A025060 (numbers of form j*k + k*i + i*j, where 1 &lt;= i &lt; j &lt; k).
 * @author Sean A. Irvine
 */
public class A025062 extends A025060 {

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
