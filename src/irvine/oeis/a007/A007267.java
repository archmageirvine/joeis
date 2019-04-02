package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007267 Expansion of 16 * (1 + k^2)^4 /(k * k'^2)^2 in powers of q where k is the Jacobian elliptic modulus, k' the complementary modulus and q is the nome.
 * @author Sean A. Irvine
 */
public class A007267 extends A007241 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.valueOf(104) : a;
  }
}

