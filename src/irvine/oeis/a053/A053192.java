package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053192 a(n) is the cototient of n^3.
 * @author Sean A. Irvine
 */
public class A053192 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n3 = Z.valueOf(++mN).pow(3);
    return n3.subtract(Euler.phi(n3));
  }
}
