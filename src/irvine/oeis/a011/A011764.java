package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011764 a(n) = 3^(2^n) (or: write in base 3, read in base 9).
 * @author Sean A. Irvine
 */
public class A011764 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    return Z.THREE.pow(1 << mN);
  }
}
