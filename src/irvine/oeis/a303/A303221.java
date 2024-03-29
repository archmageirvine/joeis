package irvine.oeis.a303;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A303221 Total area of all rectangles with dimensions p and p + q such that p and q are both squarefree, n = p + q and p &lt;= q.
 * a(n)=n*sum(i=1,floor(n/2),i*moebius(i)^2*moebius(n-i)^2)
 * @author Georg Fischer
 */
public class A303221 extends LambdaSequence {

  /** Construct the sequence. */
  public A303221() {
    super(1, n -> Z.valueOf(n).multiply(Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(i).multiply(Z.valueOf(Mobius.mobius(i)).square()).multiply(Z.valueOf(Mobius.mobius(n - i)).square()))));
  }
}
