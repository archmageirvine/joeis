package irvine.oeis.a326;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A326013 a(n) = (n+1) * (3^n + 1)^n.
 * @author Georg Fischer
 */
public class A326013 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.THREE.pow(mN).add(1).pow(mN).multiply(mN + 1);
  }
}
