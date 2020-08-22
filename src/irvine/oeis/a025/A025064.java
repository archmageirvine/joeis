package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025064 Position of numbers of form 3*n^2 in A025060 (numbers of form j*k + k*i + i*j, where 1 &lt;=i &lt; j &lt; k).
 * @author Sean A. Irvine
 */
public class A025064 extends A025060 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z[] t = super.next().divideAndRemainder(Z.THREE);
      if (Z.ZERO.equals(t[1]) && t[0].isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
