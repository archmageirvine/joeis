package irvine.oeis.a173;
// manually 2023-08-29/lambda at 2023-08-29 22:57

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A173953 a(n) = numerator of (Zeta(2, 3/4) - Zeta(2, n-1/4)), where Zeta is the Hurwitz Zeta function.
 * @author Georg Fischer
 */
public class A173953 extends LambdaSequence {

  /** Construct the sequence. */
  public A173953() {
    // for(n=1,20,print1(numerator  (16*sum(k=0,n-2,1/(4*k+3)^2)),","))
    super(1, n -> Rationals.SINGLETON.sum(0, n - 2, k -> new Q(Z.ONE, Z.valueOf(k).multiply(4).add(3).square())).multiply(16).num());
  }
}
