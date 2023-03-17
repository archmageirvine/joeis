package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070632 (2^(3^n)+1)/3^(n+1).
 * @author Georg Fischer
 */
public class A070632 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(Z.THREE.pow(mN).intValueExact()).add(1).divide(Z.THREE.pow(mN + 1));
  }
}
