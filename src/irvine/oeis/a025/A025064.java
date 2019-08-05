package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025064 Position of numbers of form <code>3*n^2</code> in <code>A025060</code> (numbers of form <code>j*k + k*i + i*j</code>, where <code>1 &lt;=i &lt; j &lt; k)</code>.
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
