package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.a010.A010054;

/**
 * A089799 Expansion of Jacobi theta function theta_2(q^(1/2))/q^(1/8).
 * @author Georg Fischer
 */
public class A089799 extends A010054 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
