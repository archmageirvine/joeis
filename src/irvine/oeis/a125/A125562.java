package irvine.oeis.a125;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A125562 a(n) = denominator of (2n + 1)!/3^n.
 * @author Georg Fischer
 */
public class A125562 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Q(Functions.FACTORIAL.z(2 * mN + 1), Z.THREE.pow(mN)).den();
  }
}
