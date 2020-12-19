package irvine.oeis.a037;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;

/**
 * A037226 a(n) = phi(2n+1) / multiplicative order of 2 mod 2n+1.
 * @author Sean A. Irvine
 */
public class A037226 extends A037225 {

  @Override
  public Z next() {
    return super.next().divide(new IntegersMod(mN).ord(Z.TWO.mod(mN)));
  }
}
