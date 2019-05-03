package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011764 <code>a(n) = 3^(2^n) (or</code>: write in base 3, read in base <code>9)</code>.
 * @author Sean A. Irvine
 */
public class A011764 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    return Z.THREE.pow(1 << mN);
  }
}
