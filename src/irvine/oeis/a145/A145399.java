package irvine.oeis.a145;
// manually  at 2023-03-26

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A145399 a(n) = Dirichlet g.f.: (1+4/2^s+1/4^s)*zeta(s)^3.
 * <code>a(2^e) = 3*e*(e+1)+1 and a(p^e) = (e+1)*(e+2)/2</code>
 * @author Georg Fischer
 */
public class A145399 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A145399() {
    super(1, (p, e) -> is2(p) ? Z.valueOf(3L * e).multiply(e + 1).add(1) : Z.valueOf(e + 1).multiply(e + 2).divide2());
  }
}
