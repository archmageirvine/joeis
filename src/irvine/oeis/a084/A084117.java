package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a085.A085015;

/**
 * A084117 Multiplicity of the factor (1+x+x^2) in the characteristic polynomial modulo 2 of the symmetric matrix with entries binomial(i+j,i), 0&lt;=i,j&lt;n.
 * @author Sean A. Irvine
 */
public class A084117 extends A085015 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(super.next()).divide2();
  }
}

