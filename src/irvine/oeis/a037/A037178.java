package irvine.oeis.a037;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Carmichael;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037178 Longest cycle when squaring modulo n-th prime.
 * @author Sean A. Irvine
 */
public class A037178 extends A000040 {

  @Override
  public Z next() {
    final Z t = Carmichael.lambda(super.next()).makeOdd();
    return Z.ONE.equals(t) ? Z.ONE : new IntegersModMul(t).order(Z.TWO);
  }
}
