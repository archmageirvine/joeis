package irvine.oeis.a173;
// manually 2023-08-29/lambda at 2023-08-29 22:31

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A173986 a(n) = numerator((Psi(1, 2/3) - Psi(1, n+2/3))/9), where Psi(1, z) is the Trigamma function.
 * @author Georg Fischer
 */
public class A173986 extends LambdaSequence {

  /** Construct the sequence. */
  public A173986() {
    super(0, n -> Rationals.SINGLETON.sum(0, n - 2, k -> new Q(Z.TWO, Z.valueOf(k).multiply(3).add(2).square())).num());
    super.next();
  }
}
