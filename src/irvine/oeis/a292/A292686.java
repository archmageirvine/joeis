package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A292686 Sierpinski-type iteration: start with a(0)=1, at each step, replace 0 with 000 and 1 with 101.
 * <code>a(n+1) = (100^(3^n)+1)*a(n), a(0)=1</code>
 * @author Georg Fischer
 */
public class A292686 implements Sequence {

  private int mN = -1;
  private Z mA;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(Z.valueOf(100).pow(Z.THREE.pow(mN - 1)).add(1));
    }
    return mA;
  }
}
