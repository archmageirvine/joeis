package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082511 a(n) = 3^n mod 2n.
 * @author Georg Fischer
 */
public class A082511 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.THREE.pow(mN).mod(Z.valueOf(2 * mN));
  }
}
