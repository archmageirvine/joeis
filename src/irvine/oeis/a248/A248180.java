package irvine.oeis.a248;
// manually 2026-04-29/parmof5 at 2026-04-29 22:13

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A248180 Least k such that r - sum{1/C(2h+1,h), h = 0..k} &lt; 1/2^n, where r = (2/27)*(9 + 2*sqrt(3)*Pi).
 * @author Georg Fischer
 */
public class A248180 extends A248148 {

  /** Construct the sequence. */
  public A248180() {
    super(0, CR.valueOf(new Q(2, 27)).multiply(CR.PI.multiply(2).multiply(CR.THREE.sqrt()).add(9)), 0, h -> new Q(Z.ONE, Binomial.binomial(2 * h + 1, h)), n -> new Q(Z.ONE, Z.TWO.pow(n)));
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return result.isZero() ? Z.ONE : result;
  }
}
